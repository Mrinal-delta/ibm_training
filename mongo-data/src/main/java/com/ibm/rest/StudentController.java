package com.ibm.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.ibm.model.Student;
import com.ibm.service.StudentService;
import com.ibm.util.InvalidStudentException;

@RestController
public class StudentController {

	@Autowired
	private StudentService service;
	
	@PostMapping(value="add",consumes="application/json")
	public String addStudent(@RequestBody Student s) {
		service.addStudent(s);
		return "Student: "+s.getName()+" with Roll: "+s.getRoll_no()+" has been added.";
	}
	
	@GetMapping(value="get/{roll}",produces="application/json")
	public Student getStudent(@PathVariable int roll) {
		try {
			return service.fetch(roll);
		} catch (InvalidStudentException e) {
			e.printStackTrace();
			throw new ResponseStatusException(HttpStatus.NOT_FOUND);
		}
	}
	
	@GetMapping(value="list",produces="application/json")
	public List<Student> list(){
		return service.list();
	}
	
	@GetMapping(value="listbyschool/{school}",produces="application/json")
	public List<Student> listBySchool(@PathVariable String school){
		return service.listBySchool(school);
	}
	
}
