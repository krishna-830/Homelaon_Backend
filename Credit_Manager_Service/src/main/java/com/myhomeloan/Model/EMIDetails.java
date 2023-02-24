package com.myhomeloan.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EMIDetails {
	@Id
	private int emiID;
	private double emiAmountMonthly;
	private String nextEmiDueDate;
	private String previousEmiStatus;


}
