package com.myhomeloan.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Cibil {
	@Id
	private int cibilId;
	private int cibilScore;
	private String status;
	private String remarks;
	private int eID;

}
