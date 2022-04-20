package com.ibm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.model.Doctor;
import com.ibm.repo.DoctorRepository;
import com.ibm.util.InvalidDoctorException;

@Service
public class DoctorServiceImpl implements DoctorService {

	@Autowired
	private DoctorRepository repo;
	
	@Override
	public void add(Doctor d) {
		repo.save(d);
	}

	@Override
	public Doctor fetch(int id) throws InvalidDoctorException {
		return repo.findById(id).get();
	}

	@Override
	public List<Doctor> list() {
		return repo.findAll();
	}

	@Override
	public List<Doctor> listByField(String field) {
		return repo.findAllByField(field);
	}

}
