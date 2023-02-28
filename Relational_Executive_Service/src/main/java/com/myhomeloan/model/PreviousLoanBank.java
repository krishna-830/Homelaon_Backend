package com.myhomeloan.model;

import javax.persistence.CascadeType;
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
public class PreviousLoanBank {
	
	private String branchName;
	private double branchCode;
	@Id
	   @GeneratedValue(strategy = GenerationType.AUTO)
	private int branchId;
	private String Branchtype;
	private String IFSCcode;
	private String MICRcode;
	private double ConatctNO;
	@OneToOne(cascade = CascadeType.ALL)
	private BankAddress BranchAddress ;
	private String Email;
	private String status;


}
