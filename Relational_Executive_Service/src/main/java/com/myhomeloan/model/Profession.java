package com.myhomeloan.model;


import javax.persistence.Entity;
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
	private int pid;
	private String ptype;
	private double psalary;
	private String psalarytype;
	private String pworkingperiod;
	private String pDesignation;
	private byte[] psalaryslips;

}
