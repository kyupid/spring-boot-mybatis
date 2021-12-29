package com.example.demo;

import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface EmployeeMapper {

    List<Employee> getAll();

    int insert(Employee employee);

    Employee getById(int id);

    List<Employee> getByCompanyId(int companyId);
}
