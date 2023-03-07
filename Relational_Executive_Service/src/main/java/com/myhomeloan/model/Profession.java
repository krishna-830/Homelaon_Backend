package com.myhomeloan.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Profession {

	@Id
	   @GeneratedValue(strategy = GenerationType.AUTO)
	private int pid;
	private String ptype;
	private double psalary;
	private String palarytype;
	private String pworkingperiod;
	private String pDesignation;


 //alldone
}
