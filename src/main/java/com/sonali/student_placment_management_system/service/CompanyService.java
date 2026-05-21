package com.sonali.student_placment_management_system.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sonali.student_placment_management_system.entity.Company;
import com.sonali.student_placment_management_system.repository.CompanyRepository;

@Service
public class CompanyService{
    @Autowired
    private CompanyRepository companyRepository;
    public Company saveCompany(Company company){
        return companyRepository.save(company);
    }
    public List<Company> getAllCompanies(){
        return companyRepository.findAll();
    }
    public Company getCompanyById(Long id){
        return companyRepository.findById(id).orElse(null);
    }
    public Company updateCompany(Long id, Company updateCompany){
        Company existingCompany= companyRepository.findById(id).orElse(null);
        if(existingCompany !=null){
            existingCompany.setCompanyName(updateCompany.getCompanyName());
            existingCompany.setRole(updateCompany.getRole());
            existingCompany.setPackageAmount(updateCompany.getPackageAmount());
            existingCompany.setEligibilityCgpa(updateCompany.getEligibilityCgpa());
            return companyRepository.save(existingCompany);
        }
        return null;
    }
    public void deleteCompany(Long id){
        companyRepository.deleteById(id);
    }
}