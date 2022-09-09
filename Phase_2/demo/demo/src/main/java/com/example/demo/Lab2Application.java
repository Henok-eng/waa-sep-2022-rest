package com.example.demo;

import com.example.demo.domain.Student;
import com.example.demo.repositories.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Lab2Application  {

	public static void main(String[] args) {
		SpringApplication.run(Lab2Application.class, args);
	}


}
