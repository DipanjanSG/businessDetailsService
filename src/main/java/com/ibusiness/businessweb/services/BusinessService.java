package com.ibusiness.businessweb.services;

import java.math.BigInteger;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ibusiness.businessweb.dto.BusinessDto;
import com.ibusiness.businessweb.entity.Business;
import com.ibusiness.businessweb.mapper.ModelMappers;
import com.ibusiness.businessweb.repositories.BusinessRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class BusinessService {
	
	@Autowired
	private BusinessRepository businessRepository; 
	
	
	
	//@Autowired
	
//	@Autowired
//	ModelMappers modelMappers;
	
	public BusinessDto getBusinessById(int id) {
		//BusinessmanEntity businessmanEntity = businessmanRepository.findById(id).get();
		//System.out.println("E" + businessmanMappers.INSTANCE);
		//System.out.println("E" + businessmanMappers.businessmanEntityToBusinessmanDto(businessmanRepository.findById(id).get()));
//		modelMapper.typeMap(BusinessmanEntity.class, BusinessmanDto.class).addMappings(mapper -> {
//			  mapper.map(src -> src.getBillingAddress().getStreet(),
//			      Destination::setBillingStreet);
//			  mapper.map(src -> src.getBillingAddress().getCity(),
//			      Destination::setBillingCity);
//			});	

		return ModelMappers.businessToBusinessDto(businessRepository.findById(id).get());
		//return BusinessmanMappers.INSTANCE.businessmanEntityToBusinessmanDto(businessmanRepository.findById(id).get());
	}
	
//	public BusinessmanDto getAllDetailsOfBusinessemen(int id) {
//		return ModelMappers.businessmanAllDetailsToBusinessmanAllDetailsDto(businessmanRepository.findAllDetailsBusinessman(id));
//	}
//	
//	
	public BusinessDto getBusinessemenByBusinessmanId(int businessmanId) {	
		return ModelMappers.businessToBusinessDto(businessRepository.findBusinessByBusinessmanId(businessmanId));
	}

//	
//	public BusinessmanDto createNewBusinessman(BusinessmanDto businessmanDto) {
//		
//		return ModelMappers.businessToBusinessDto(
//				businessRepository.save(ModelMappers.BusinessDtoToBusiness(businessmanDto))
//				);
//	}
	
	
	
//	public List<Contact> getAllBusinesses() {
//		List<Contact> location = new ArrayList<Contact>();
//		businessmanRepository.findAll().forEach(location::add);
//		return location;
//	}
//	
//	public List<Contact> getBusinessesInLocation(String country, String state,String district) {
//		return businessmanRepository.findBusinessByLocation(country,state,district);
//	}
//	
//    public Contact getByBusinessNumber(int businessNumber) {
//		return businessmanRepository.findByBusinessNumber(businessNumber);
//	}
//	
//    public BusinessmanDto createNewBusiness(BusinessmanDto businessmanDto) {
//		return  ModelMappers.businessToBusinessDto(
//				businessRepository.save(ModelMappers.BusinessDtoToBusiness(businessmanDto))
//				) ;
//	}
//    
//    public Contact updateBusiness(Contact location) {
//		return businessmanRepository.save(location) ;
//	}
//    
//    public void deleteBusiness(int businessNumber) {
//    	location.setBusiness_number(businessNumber);
//		businessmanRepository.delete(location);
//		
//		
//
//		
//	}

}
