package com.tcs.HospitalWeb;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HospitalService {
@Autowired
private HospitalRepository repository;

public Hospital getHospital(int id) {
	return repository.findHospitalById(id);
//	return repository.findHospital(id);
}
public List<Hospital> getAllHospitals() {
	return repository.findAll();
}
public void updateHospital(Hospital hospital) {
	repository.save(hospital);
}
public void deleteHospital(Hospital hospital) {
	repository.delete(hospital);
}
public void addHospital(Hospital hospital) {
	repository.save(hospital);
}
}

