package com.sgic.jarapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sgic.jarapp.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Long>{
	public Student findStudentById(Long id);
}
