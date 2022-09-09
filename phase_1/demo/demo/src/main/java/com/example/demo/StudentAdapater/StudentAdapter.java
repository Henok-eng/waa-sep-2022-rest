package com.example.demo.StudentAdapater;

import com.example.demo.DTOs.StudentDTO;
import com.example.demo.domain.Course;
import com.example.demo.domain.Student;

import java.util.List;

public class StudentAdapter {

    public static Student getStudentfromStudentDTO(StudentDTO studentdto){
              List<Course> courses=studentdto.getCourses();
        Student student=new Student(studentdto.getId(),studentdto.getFirstName(),studentdto.getLastName(),
        studentdto.getEmail(),studentdto.getMajor(),studentdto.getJpa(),studentdto.getCourseTaken(),courses);
        
    }

}
