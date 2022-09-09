package com.example.demo.repositories;

import com.example.demo.domain.Course;
import com.example.demo.domain.Student;
import com.example.demo.services.Students;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.CrudRepositoryExtensionsKt;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
@Component
public class StudentRepo  {
    List<Student> students=new ArrayList<>();
    public  void saveStudent(Student s){
        students.add(s);
    }
    public Students getStudent(String major){
        List<Student> list=new ArrayList<>();
   for(Student s:students){
       if(s.getMajor().equals(major)){
           list.add(s);
       }

   }
   Students students=new Students(list);
       return students;
    }
    public  Student deleteStudent(Long id){
        for(Student s:students){
            if(s.getId()==id){
                students.remove(s);
                return s;
            }

        }
        return null;
    }
    public Student updateStudent(Long id,String name){
        for(Student s:students){
            if(s.getId()==id){
                   s.setFirstName(name);
                return s;
            }

        }
        return null;
    }
    public List<Course> getStudentById(Long id){
        List<Course> list=new ArrayList<>();
        for(Student s:students){
            if(s.getId()==id){
                list.addAll(s.getCourses());

            }
        }
        return list;
    }


}
