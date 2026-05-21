package com.sonali.student_placment_management_system.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sonali.student_placment_management_system.entity.Application;

@Repository
public interface ApplicationRepository extends JpaRepository<Application, Long> {

}