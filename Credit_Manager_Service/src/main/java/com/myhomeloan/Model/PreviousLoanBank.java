package com.myhomeloan.Model;

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
	
	
	@Id
	   @GeneratedValue(strategy = GenerationType.AUTO)
	private int branchid;
	private String branchName;
	private double branchCode;
	private String ifsc;
	private String micrCode;
	private double conatctNo;
	@OneToOne(cascade = CascadeType.ALL)
	private BankAddress branchAddress ;
	private String email;
	private String status;


//alldone
}
