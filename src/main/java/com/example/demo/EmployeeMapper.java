package com.example.demo;

import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface EmployeeMapper {

    List<Employee> getAll();

    @Insert("insert into employee(name) values( #{employee.name} )")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insert(@Param("employee") Employee employee);

    @Select("select * from employee where id=#{id}")
    Employee getById(@Param("id") int id);
}
