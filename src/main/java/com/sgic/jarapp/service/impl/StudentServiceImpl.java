package com.sgic.jarapp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.jarapp.entity.Student;
import com.sgic.jarapp.repo.StudentRepo;
import com.sgic.jarapp.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	StudentRepo studentRepo;
	
	@Override
	public List<Student> getAllStudent() {
		return studentRepo.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		return studentRepo.save(student);
	}

	@Override
	public Student findOneStudent(Long id) {
		return studentRepo.findStudentById(id);
	}

}
