package com.example.demo;

import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface EmployeeMapper {

    List<Employee> getAll();

    int insert(Employee employee);

    Employee getById(int id);

    @Select("select * from employee where company_id=#{companyId}")
    List<Employee> getByCompanyId(@Param("companyId") int companyId);
}
