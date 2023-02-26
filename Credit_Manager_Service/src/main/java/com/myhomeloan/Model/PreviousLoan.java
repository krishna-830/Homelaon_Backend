package com.myhomeloan.Model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PreviousLoan {
	@Id
	//   @GeneratedValue(strategy = GenerationType.AUTO)
	private int ploanId;
	private double ploanAmount;
	private int pTenure;
	private double paidAmount;
	private double remainingAmount;
	private int deafulterCount;
	@OneToOne
	private PreviousLoanBank pbankDetails;
	private String status;
	private String remark;



}
