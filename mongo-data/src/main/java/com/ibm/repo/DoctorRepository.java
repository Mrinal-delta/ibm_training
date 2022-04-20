package com.ibm.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ibm.model.Doctor;

public interface DoctorRepository extends MongoRepository<Doctor, Integer>{

	List<Doctor> findAllByField(String field);
}
