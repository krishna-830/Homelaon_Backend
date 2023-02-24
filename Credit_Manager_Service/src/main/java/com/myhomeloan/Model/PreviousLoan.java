package com.myhomeloan.Model;


import javax.persistence.Entity;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PreviousLoan {
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
