package com.example.demo.controller;

import com.example.demo.DTOs.StudentDTO;
import com.example.demo.domain.Student;
import com.example.demo.services.Students;
import com.example.demo.services.Studentservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
@Autowired
    private Studentservice studentservice;

    @PostMapping("/students")
    public ResponseEntity<?> save(@RequestBody StudentDTO s){
        studentservice.saveStudent(s);
        return new ResponseEntity<StudentDTO>(s, HttpStatus.OK);
    }
    @GetMapping("/students/{major}")
    public ResponseEntity<?> getStudent(@PathVariable String major){
       Students student= studentservice.getStudent(major);

       return new ResponseEntity<Students>(student,HttpStatus.OK);
    }
    @DeleteMapping("/students/{id}")
    public ResponseEntity<?> delete(@PathVariable long id){
        StudentDTO student=studentservice.deleteStudent(id);
        return new ResponseEntity<StudentDTO>(student,HttpStatus.OK);
    }
    @PutMapping("/students/{id}/{name}")
    public ResponseEntity<?> update(@PathVariable long id,@PathVariable String name){
        StudentDTO student=studentservice.updateStudent(id,name);
        return new ResponseEntity<StudentDTO>(student,HttpStatus.OK);
    }




}
