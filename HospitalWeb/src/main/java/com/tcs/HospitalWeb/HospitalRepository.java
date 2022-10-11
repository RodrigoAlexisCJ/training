package com.tcs.HospitalWeb;

import java.util.List;

//import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HospitalRepository extends CrudRepository<Hospital,Integer>{
	//@Query("select h from Hospital where h.id = ?1")
	//public Hospital findHospital(Integer id);
	public Hospital findHospitalById(Integer id);
	@Override
	public List<Hospital> findAll();
}
