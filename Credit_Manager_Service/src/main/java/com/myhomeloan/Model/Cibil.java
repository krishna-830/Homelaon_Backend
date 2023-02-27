package com.myhomeloan.Model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cibil {
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private int cibilId;
	private int cibilScore;
	
	private String status;
	private String remark;


}
