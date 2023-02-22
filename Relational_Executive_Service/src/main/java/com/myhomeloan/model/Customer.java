package com.myhomeloan.model;

import javax.jws.Oneway;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
	private int eID;
	private String Name;
	private String DOB;
	private int Age;
	private String Gender;
	private String Email;
    private double MobileNo;
    private double cAdditionalMobileNo;
    private double cAmountPaidforHome;
    private double cToltalLoanRequired;
    
    @OneToMany
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
    @OneToMany
    private PreviousLoan cPreviousLoan;
    @OneToOne
    private AccountDetails cAccountDetails;
    @OneToOne
    private PropertyInfo cPropertyInfo;
    @OneToMany
    private GuarantorDetails cGuarantorDetails;
    

    
    
    
    
    
	
	

}
