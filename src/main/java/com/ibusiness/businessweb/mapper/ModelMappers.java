package com.ibusiness.businessweb.mapper;

import org.modelmapper.ModelMapper;
import com.ibusiness.businessweb.dto.BusinessDto;
import com.ibusiness.businessweb.entity.Business;

public class ModelMappers {
	
	static ModelMapper modelMapper = new ModelMapper();
	
	public static BusinessDto businessToBusinessDto(Business businessman) {
		
		return modelMapper.map(businessman,BusinessDto.class);
	}
	public static Business BusinessDtoToBusiness(BusinessDto businessDto) {
		return modelMapper.map(businessDto,Business.class);
	}


}
