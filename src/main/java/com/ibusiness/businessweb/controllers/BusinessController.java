package com.ibusiness.businessweb.controllers;

import java.math.BigInteger;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.ibusiness.businessweb.dto.BusinessDto;
import com.ibusiness.businessweb.entity.Business;
import com.ibusiness.businessweb.messaging.producer.Producer;
import com.ibusiness.businessweb.services.BusinessService;

@RestController
@RequestMapping("/businesses/v1")
public class BusinessController {

	@Autowired
	private BusinessService businessService;
	
	@Autowired
	Producer producer ;
	
	@GetMapping("/{id}") 
	public ResponseEntity<BusinessDto> getBusinessById(@PathVariable int id) {
		return new ResponseEntity<>(businessService.getBusinessById(id),HttpStatus.OK);
	}
	
//	@GetMapping("/findBusinessmanAllDetails/v1/{id}")
//	public ResponseEntity<BusinessmanDto> findBusinessmanAllDetails(@PathVariable int id) {
//		return new ResponseEntity<>(businessmanService.getAllDetailsOfBusinessemen(id),HttpStatus.OK);
//	} 
		
	@GetMapping("/businessman/{businessmanId}")
	public ResponseEntity<BusinessDto> findBusinessByBusinessmanId(@PathVariable int businessmanId) {
		return new ResponseEntity<>(businessService.getBusinessemenByBusinessmanId(businessmanId),HttpStatus.OK);
	}
//	
//	@GetMapping("/findTotalBusiness")
//	public ResponseEntity<Integer> getTotalNumberOfBusinesses() {
//		return new ResponseEntity<>(getAllBusinesses().getBody().size(),HttpStatus.OK);
//	} 
//	
//	@PostMapping("/createBusiness")
//	public ResponseEntity<HttpHeaders> createNewBusiness(@RequestBody BusinessmanDto businessmanDto) {
//		
//		businessmanDto = businessmanService.createNewBusiness(businessmanDto);
//		HttpHeaders httpHeader = new HttpHeaders();
//		httpHeader.add("Location","/createBusiness"+String.valueOf(businessmanDto.getId()));
//		
//		return new ResponseEntity<>(httpHeader,HttpStatus.CREATED);
//	} 
//	
//	@PutMapping("/updateBusiness/{id}")
//	public ResponseEntity<HttpHeaders> updateBusiness(@PathVariable int id, @RequestBody Contact location) {
//		Contact updatedLocation = locationService.updateBusiness(location);
//		if (updatedLocation == null)
//				return new ResponseEntity(HttpStatus.NO_CONTENT);
//		HttpHeaders httpHeader = new HttpHeaders();
//		httpHeader.add("Updated "+ location.getId(),"/createBusiness"+updatedLocation.toString());
//		return new ResponseEntity<>(httpHeader,HttpStatus.OK);
//	}
//
//	@PutMapping("/deleteBusiness/{businessNumber}")
//	public ResponseEntity<HttpHeaders> deleteBusiness(@PathVariable int businessNumber) {
//		locationService.deleteBusiness(businessNumber);
//		HttpHeaders httpHeader = new HttpHeaders();
//		
//		if ( locationService.getByBusinessNumber(businessNumber) == null ) {
//			httpHeader.add("Deleted ", "business id " +businessNumber);
//			return new ResponseEntity<>(httpHeader,HttpStatus.NO_CONTENT);
//			
//		}
//		
//		httpHeader.add("Not Deleted ", "business id " +businessNumber);
//		return new ResponseEntity<>(httpHeader,HttpStatus.OK);		
//	}
	
}
