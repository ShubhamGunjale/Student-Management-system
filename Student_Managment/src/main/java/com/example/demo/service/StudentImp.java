package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.*;
import com.example.demo.Entity.Student;
import com.example.demo.Repository.StudentRepository;


@Service
public class StudentImp implements StudentService{

	private StudentRepository studentRepository;
	
	public StudentImp(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

	@Override
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public Student getStudentById(Long id) {
		return studentRepository.findById(id).get();
	}

	@Override
	public Student updateStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public void deleteStudentById(Long id) {
		studentRepository.deleteById(id);	
	}

}