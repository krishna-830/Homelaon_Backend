package com.myhomeloan.Model;

import javax.persistence.CascadeType;
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

	private int eid;
	private String name;
	private String dob;
	private int age;
	private String gender;
	private String email;
	private double mobileNo;
	private double cAdditionalMobileNo;
	private double cAmountPaidforHome;
	private double cToltalLoanRequired;

	@OneToOne(cascade = CascadeType.ALL)
	private EducationaInfo cEducationalInfo;
	@OneToOne(cascade = CascadeType.ALL)
	private AllPersonalDocs cAllPersonalDocs;
	@OneToOne(cascade = CascadeType.ALL)
	private CustomerAddress cAddress;
	@OneToOne(cascade = CascadeType.ALL)
	private Profession cProfession;
	@OneToOne(cascade = CascadeType.ALL)
	private Cibil ccibil;
	@OneToOne(cascade = CascadeType.ALL)
	private LoanDetails cLoanDetails;
	@OneToOne(cascade =CascadeType.ALL)
	private PreviousLoan cPreviousLoan;
	@OneToOne(cascade = CascadeType.ALL)
	private AccountDetails cAccountDetails;
	@OneToOne(cascade = CascadeType.ALL)
	private PropertyInfo cPropertyInfo;
	@OneToOne(cascade = CascadeType.ALL)
	private GuarantorDetails cGuarantorDetails;

	
}
