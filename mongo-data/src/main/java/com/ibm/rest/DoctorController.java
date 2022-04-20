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

import com.ibm.model.Doctor;
import com.ibm.service.DoctorService;
import com.ibm.util.InvalidDoctorException;

@RestController
public class DoctorController {

	@Autowired
	private DoctorService service;
	
	@PostMapping(value="adddoc",consumes="application/json")
	public String addDoctor(@RequestBody Doctor d) {
		service.add(d);
		return "Doctor: "+d.getName()+" has joined";
	}
	
	@GetMapping(value="getDoc/{id}",produces="application/json")
	public Doctor fetchDoc(@PathVariable int id) {
		try {
			return service.fetch(id);
		} catch (InvalidDoctorException e) {
			e.printStackTrace();
			throw new ResponseStatusException(HttpStatus.NOT_FOUND);
		}
	}
	
	@GetMapping(value="getlist",produces="application/json")
	public List<Doctor> fetchList(){
		return service.list();
	}
	
	@GetMapping(value="listfield/{field}",produces="application/json")
	public List<Doctor> fetchList(@PathVariable String field){
		return service.listByField(field);
	}
}
