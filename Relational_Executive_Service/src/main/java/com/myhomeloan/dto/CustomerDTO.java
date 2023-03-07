package com.myhomeloan.dto;



import javax.persistence.CascadeType;
import javax.persistence.OneToOne;

import com.myhomeloan.model.AccountDetails;
import com.myhomeloan.model.AllPersonalDocs;
import com.myhomeloan.model.Cibil;
import com.myhomeloan.model.CustomerAddress;
import com.myhomeloan.model.EducationaInfo;
import com.myhomeloan.model.GuarantorDetails;
import com.myhomeloan.model.LoanDetails;
import com.myhomeloan.model.PreviousLoan;
import com.myhomeloan.model.Profession;
import com.myhomeloan.model.PropertyInfo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDTO {

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


	private EducationaInfo cEducationalInfo;
	
	private AllPersonalDocs cAllPersonalDocs;

	private CustomerAddress cAddress;

	private Profession cProfession;
	
	private Cibil ccibil;

	private LoanDetails cLoanDetails;

	private PreviousLoan cPreviousLoan;
	
	private AccountDetails cAccountDetails;
	
	private PropertyInfo cPropertyInfo;
	
	private GuarantorDetails cGuarantorDetails;


}
