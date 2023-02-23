package com.myhomeloan.model;

import javax.persistence.Entity;

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
	private int branchId;
	private String Branchtype;
	private String IFSCcode;
	private String MICRcode;
	private double ConatctNO;
	private BankAddress BranchAddress ;
	private String Email;
	private String status;


}
