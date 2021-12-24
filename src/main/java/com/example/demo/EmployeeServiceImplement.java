package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImplement implements EmployeeService {

    private EmployeeMapper employeeMapper;

    @Autowired
    public EmployeeServiceImplement(EmployeeMapper employeeMapper) {
        this.employeeMapper = employeeMapper;
    }

    @Override
    public List<Employee> getEmployee() {
        return employeeMapper.getEmployee();
    }

    @Override
    public int insert(Employee employee) {
        return employeeMapper.insert(employee);
    }
}
