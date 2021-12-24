package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class EmployeeController {
    private EmployeeServiceImplement employeeService;

    @Autowired
    public EmployeeController(EmployeeServiceImplement employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employee")
    @ResponseBody
    public List<Employee> getEmployee() {
        return employeeService.getEmployee();
    }
}
