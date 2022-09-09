package com.example.demo.DTOs;

import com.example.demo.domain.Course;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class StudentDTO {

    private long id;
    private String firstName;
    private String lastName;
    private String email;
    private String major;
    private String jpa;
    private String courseTaken;
    private List<Course> courses=new ArrayList<>();


}
