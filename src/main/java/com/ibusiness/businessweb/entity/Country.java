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
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "countries")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Country {	

	 @Id
	 int id;
	 String name;
	 String isoCode;
	 
	 @OneToMany(cascade = CascadeType.ALL)
	 List <State> state;
}
