package com.ibusiness.businessweb.entity;

import java.math.BigInteger;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "states")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class State {	

	 @Id
	 int id;
	 String name;
	 
	 @OneToMany(cascade = CascadeType.ALL)
	 List <City> city;
	 
	 @ManyToOne(cascade = CascadeType.ALL)
	 @JoinColumn(name = "country")
	 Country country;

}
