package com.myhomeloan.model;

import javax.persistence.Entity;

import javax.persistence.Id;

import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
	@Id
<<<<<<< HEAD
=======

>>>>>>> 5567ee990f555994b9468c2d2034a44b642e2906
	private int eID;
	private String name;
	private String DOB;
	private int Age;
	private String Gender;
	private String Email;
	private double MobileNo;
	private double cAdditionalMobileNo;
	private double cAmountPaidforHome;
	private double cToltalLoanRequired;

	@OneToOne
	private EducationaInfo cEducationalInfo;
	@OneToOne
	private AllPersonalDocs cAllPersonalDocs;
	@OneToOne
	private CustomerAddress cAddress;
	@OneToOne
	private Profession cProfession;
	@OneToOne
	private Cibil ccbil;
	@OneToOne
	private LoanDetails cLoanDetails;
	@OneToOne
	private PreviousLoan cPreviousLoan;
	@OneToOne
	private AccountDetails cAccountDetails;
	@OneToOne
	private PropertyInfo cPropertyInfo;
	@OneToOne
	private GuarantorDetails cGuarantorDetails;

}
