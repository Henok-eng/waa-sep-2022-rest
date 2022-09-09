package com.example.demo.services;

import com.example.demo.domain.Student;
import com.example.demo.repositories.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Studentservice {
     @Autowired
    private StudentRepo studentrepo;


    public void saveStudent(Student s){
        studentrepo.saveStudent(s);
    }
    public Students getStudent(String major){
       Students student= studentrepo.getStudent(major);
       return student;
    }
    public Student deleteStudent(Long id){
        Student student=studentrepo.deleteStudent(id);
        return student;
    }
    public Student updateStudent(Long id,String name){
        Student student=studentrepo.updateStudent(id,name);
        return student;
    }



}
