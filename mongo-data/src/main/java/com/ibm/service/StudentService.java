package com.ibm.service;

import java.util.List;

import com.ibm.model.Student;
import com.ibm.util.InvalidStudentException;

public interface StudentService {

	void addStudent(Student s);
	
	Student fetch(int roll) throws InvalidStudentException;
	
	List<Student> list();
	
	List<Student> listBySchool(String school);
}
