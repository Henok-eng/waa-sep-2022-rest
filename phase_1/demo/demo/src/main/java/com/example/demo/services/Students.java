package com.example.demo.services;

import com.example.demo.domain.Student;

import java.util.ArrayList;
import java.util.List;

public class Students {

    List<Student> student=new ArrayList<>();

    public Students(List<Student> list){
        this.student=list;
    }

    public List<Student> getStudent() {
        return student;
    }
}
