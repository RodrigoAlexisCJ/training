package com.tcs.Hospital;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HospitalService {
@Autowired
private HospitalRepository repository;

public Hospital getHospital(int id) {
	return repository.findHospitalById(id);
}
public List<Hospital> getAllHospitals() {
	return repository.findAll();
}
public void updateHospital(Hospital hospital) {
	repository.save(hospital);
}
}
