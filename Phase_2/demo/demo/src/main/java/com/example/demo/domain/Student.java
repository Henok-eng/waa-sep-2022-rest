package com.example.demo.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Student {

    private long id;
    private String firstName;
    private String lastName;
    private String email;
    private String major;
    private String jpa;
    private String courseTaken;
    private List<Course> courses=new ArrayList<>();


}
