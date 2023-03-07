package com.myhomeloan.model;

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
public class Ledger {


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int ledgerId;
	private String ledgerCreatedDate;
	private double totalLoanAmount;
	private double payableAmountwithInterest;
	private int tenure;
	private double monthlyEmi;
	private double amountPaidtillDate;
	private double remainingAmount;
	private String nextEmiStartDate;
	private String nextEmiEnddate;
	private int defaulterCount;
	private String previousEmitStatus;
	private String currentMonthEmiStatus;
	private String loanEndDate;
	private String loanStatus;
	

	//alldone
	

}
