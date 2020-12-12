package com.ibusiness.businessweb.dto;

import java.io.Serializable;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class BusinessDto {	
	 
	 int id;
	 String  name;
	 String industry;
	 int businessman;
	 CityDto location;
	 //List <ProductsDto> products;
}
