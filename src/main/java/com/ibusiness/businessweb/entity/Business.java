package com.ibusiness.businessweb.entity;

import java.math.BigInteger;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@Table(name = "business")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Business {	
	 @Id
	 int id;
	 
	 String  name;
	 String industry;
	 int businessman;
	 
	 @OneToOne(cascade = CascadeType.ALL)
	 @JoinColumn(name = "location")
	 City location;
	 
	 @OneToMany(cascade = CascadeType.ALL)
	 @JoinColumn(name = "business")
	 List <Product> products;
}