package com.tcs.HospitalWeb;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test/")
public class HospitalController {
@Autowired
private HospitalService service;

@RequestMapping(value="/hospitals",method=RequestMethod.GET)
public @ResponseBody List<Hospital> getAllHospitals() throws Exception{
	return this.service.getAllHospitals();
}
@RequestMapping(value="/hospital/{id}",method=RequestMethod.GET)
public @ResponseBody Hospital getHospital(@PathVariable ("id") int id) throws Exception{
	return this.service.getHospital(id);
}

@RequestMapping(value="/hospitals",method=RequestMethod.PUT)
public ResponseEntity<String> addHospital(@RequestBody Hospital hospital  ) {
this.service.addHospital(hospital);
      return new ResponseEntity<>(HttpStatus.OK);
}


public ResponseEntity<String> updateHospital(@RequestBody Hospital hospital) {
	this.service.updateHospital(hospital);
      return new ResponseEntity<>(HttpStatus.OK);
}

@RequestMapping(value="/hospitals", method=RequestMethod.DELETE)
public ResponseEntity<String> deleteHospital(@RequestBody Hospital hospital) {
	this.service.deleteHospital(hospital);
      return new ResponseEntity<>(HttpStatus.NO_CONTENT);
}

}
