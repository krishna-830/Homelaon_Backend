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
public class SanctionLetter {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int sid;
	private String sanctionDate;
	private int prospectNo;
	private String applicantName;
	private String contactDetails;
	private String product;
	private double loanAmtSanctioned;
	private String interestType;
	private int rateOfInterest;
	private int loanTenure;
	private double monthlyEmiAmount;
	private String modeOfPayment;
	private String remarks;
	private String termsandCondition;
	private String status;
    private String email;
    
   
 
 //alldone

}
