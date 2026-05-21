package com.sonali.student_placment_management_system.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Company{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String companyName;
    private String role;
    private Double packageAmount;
    private Double eligibilityCgpa;

    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id=id;
    }
    public String getCompanyName(){
        return companyName;
    }
    public void setCompanyName(String companyName){
        this.companyName=companyName;
    }
    public String getRole(){
        return role;
    }
    public void setRole(String role){
        this.role=role;
    }
    public Double getPackageAmount(){
        return packageAmount;
    }
    public void setPackageAmount(Double packageAmount){
        this.packageAmount=packageAmount;
    }
    public Double getEligibilityCgpa(){
        return eligibilityCgpa;
    }
    public void setEligibilityCgpa(Double eligibilityCgpa){
        this.eligibilityCgpa=eligibilityCgpa;
    }
}