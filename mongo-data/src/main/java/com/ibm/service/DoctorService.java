package com.ibm.service;

import java.util.List;

import com.ibm.model.Doctor;
import com.ibm.util.InvalidDoctorException;

public interface DoctorService {
	
	void add(Doctor d);
	
	Doctor fetch(int id) throws InvalidDoctorException;
	
	List<Doctor> list();
	
	List<Doctor> listByField(String field);
}
