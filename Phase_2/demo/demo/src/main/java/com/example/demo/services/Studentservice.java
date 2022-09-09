package com.example.demo.services;

import com.example.demo.DTOs.StudentDTO;
import com.example.demo.StudentAdapater.StudentAdapter;
import com.example.demo.domain.Student;
import com.example.demo.repositories.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.MergedAnnotation;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Studentservice {
     @Autowired
    private StudentRepo studentrepo;


    public void saveStudent(StudentDTO s){
        Student student= StudentAdapter.getStudentfromStudentDTO(s);
        studentrepo.saveStudent(student);
    }
    public Students getStudent(String major){
       Students student= studentrepo.getStudent(major);
       return student;
    }
    public StudentDTO deleteStudent(Long id){
        Student student=studentrepo.deleteStudent(id);
        StudentDTO studentdto=StudentAdapter.getStudentDTOfromStudent(student);
        return studentdto;
    }
    public StudentDTO updateStudent(Long id,String name){
        Student student=studentrepo.updateStudent(id,name);
        StudentDTO studentdto= StudentAdapter.getStudentDTOfromStudent(student);
        return studentdto;
    }



}
