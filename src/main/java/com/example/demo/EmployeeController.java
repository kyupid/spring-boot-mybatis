package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    private EmployeeServiceImplement employeeService;

    @Autowired
    public EmployeeController(EmployeeServiceImplement employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("")
    @ResponseBody
    public List<Employee> getAll() {
        return employeeService.getAll();
    }

    @PostMapping("/post")
    public Employee post(@RequestBody Employee employee) {
        employeeService.insert(employee);
        return employee;
    }

    @GetMapping("/{id}")
    public Employee getById(@PathVariable("id") int id) {
        return employeeService.getById(id);
    }

    @GetMapping("/company/{company_id}")
    public List<Employee> getByCompanyId(@PathVariable("company_id") int company_id) {
        return employeeService.getByCompanyId(company_id);
    }

    @PostMapping("/update/{id}")
    public void update(@RequestBody Employee employee, @PathVariable("id") int id) {
        employee.setId(id);
        System.out.println(employee);
        employeeService.update(employee);
    }
}
