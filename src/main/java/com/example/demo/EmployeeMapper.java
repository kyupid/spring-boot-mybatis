package com.example.demo;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface EmployeeMapper {

    List<Employee> getAll();

    @Insert("insert into employee(name) values( #{employee.name} )")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insert(@Param("employee") Employee employee);
}
