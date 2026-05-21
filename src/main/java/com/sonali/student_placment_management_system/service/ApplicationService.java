package com.sonali.student_placment_management_system.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sonali.student_placment_management_system.entity.Application;
import com.sonali.student_placment_management_system.repository.ApplicationRepository;

@Service
public class ApplicationService {

    @Autowired
    private ApplicationRepository applicationRepository;

    // Add Application
    public Application saveApplication(Application application) {
        return applicationRepository.save(application);
    }

    // Get All Applications
    public List<Application> getAllApplications() {
        return applicationRepository.findAll();
    }

    // Get Application By ID
    public Application getApplicationById(Long id) {
        return applicationRepository.findById(id).orElse(null);
    }

    // Update Application Status
    public Application updateApplication(Long id, Application updatedApplication) {
        Application existingApplication =
                applicationRepository.findById(id).orElse(null);

        if (existingApplication != null) {
            existingApplication.setStudentId(updatedApplication.getStudentId());
            existingApplication.setCompanyId(updatedApplication.getCompanyId());
            existingApplication.setStatus(updatedApplication.getStatus());

            return applicationRepository.save(existingApplication);
        }
        return null;
    }

    // Delete Application
    public void deleteApplication(Long id) {
        applicationRepository.deleteById(id);
    }
}