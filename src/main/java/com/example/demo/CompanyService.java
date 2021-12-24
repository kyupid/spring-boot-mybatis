package com.example.demo;

import java.util.List;

public interface CompanyService {
    List<Company> getAll();

    int insert(Company company);

    Company getById(int id);
}
