package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.Entity.Student;
import com.example.demo.Repository.StudentRepository;

@SpringBootApplication
public class StudentManagmentApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagmentApplication.class, args);
	}
@Autowired
private StudentRepository studentRepo;
/*	@Override
	public void run(String... args) throws Exception {
		Student student1=new Student(0, "Ramesh","patil","@gmail");
		studentRepo.save(student1);
		Student student2=new Student(0, "Sumit","Rathod","@S");
		// TODO Auto-generated method stub
		studentRepo.save(student2);
		*/
@Override
public void run(String... args) throws Exception {
	// TODO Auto-generated method stub
	
}
	}


