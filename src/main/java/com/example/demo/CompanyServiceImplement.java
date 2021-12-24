package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyServiceImplement implements CompanyService {
    private CompanyMapper companyMapper;

    @Autowired
    public CompanyServiceImplement(CompanyMapper companyMapper) {
        this.companyMapper = companyMapper;
    }

    @Override
    public List<Company> getAll() {
        return companyMapper.getAll();
    }

    @Override
    public int insert(Company company) {
        return companyMapper.insert(company);
    }

    @Override
    public Company getById(int id) {
        return companyMapper.getById(id);
    }
}
