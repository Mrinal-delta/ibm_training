package com.ibm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.model.Student;
import com.ibm.repo.StudentRepository;
import com.ibm.util.InvalidStudentException;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository repo;
	
	@Override
	public void addStudent(Student s) {
		repo.save(s);
	}

	@Override
	public Student fetch(int roll) throws InvalidStudentException {
		return repo.findById(roll).get();
	}

	@Override
	public List<Student> list() {
		return repo.findAll();
	}

	@Override
	public List<Student> listBySchool(String school) {
		return repo.findAllBySchool(school);
	}

}
