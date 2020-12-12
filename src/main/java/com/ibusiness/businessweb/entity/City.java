package com.ibusiness.businessweb.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "cities")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class City {	

	 @Id
	 int id;
	 String name;
	 
	 @ManyToOne(cascade = CascadeType.ALL)
	 @JoinColumn(name = "state")
	 State state;

}
