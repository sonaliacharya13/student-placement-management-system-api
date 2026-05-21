package com.sonali.student_placment_management_system.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sonali.student_placment_management_system.entity.Student;
import com.sonali.student_placment_management_system.repository.StudentRepository;

@Service
public class StudentService{
    @Autowired
    private StudentRepository studentRepository;
    public Student saveStudent(Student student){
        return studentRepository.save(student);
    }
    public List<Student> getAllStudent(){
        return studentRepository.findAll();
    }
    public Student getStudentById(Long id){
        return studentRepository.findById(id).orElse(null);
    }
    public Student updateStudent(Long id, Student updateStudent){
        Student existingStudent=studentRepository.findById(id).orElse(null);
        if(existingStudent != null){
            existingStudent.setName(updateStudent.getName());
            existingStudent.setEmail(updateStudent.getEmail());
            existingStudent.setCourse(updateStudent.getCourse());
            existingStudent.setCgpa(updateStudent.getCgpa());
            return studentRepository.save(existingStudent);
        }
        return null;
    }
    public void deleteStudent(Long id){
        studentRepository.deleteById(id);
    }
}
