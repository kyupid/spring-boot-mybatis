package com.example.demo;

import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface CompanyMapper {
    List<Company> getAll();

    @Insert("insert into company(name) values( #{company.name} )")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insert(@Param("company") Company company);

    @Select("select * from company where id=#{id}")
    Company getById(@Param("id") int id);
}
