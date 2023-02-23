package com.myhomeloanapp.model;

import javax.persistence.Entity;

import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cibil {

	@Id
	private int cibilId;
	private int cibilScore;
	private String cibilScoreDateTime;
	private String status;
	private String remarks;
	

}
