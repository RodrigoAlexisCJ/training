package com.tcs.Hospital;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface HospitalRepository extends CrudRepository<Hospital,Integer>{
	public Hospital findHospitalById(Integer id);
	@Override
	public List<Hospital> findAll();
}
