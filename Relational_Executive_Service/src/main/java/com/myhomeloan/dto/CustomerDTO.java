package com.myhomeloan.dto;

import javax.persistence.OneToOne;

import com.myhomeloan.model.AccountDetails;
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
    
//    
//    private CustomerAddress cAddress;
//    
//    private Profession cProfession;
//    
//    private Cibil ccbil;
//    
//    private LoanDetails cLoanDetails;
//    
//    private PreviousLoan cPreviousLoan;
//    
//    private AccountDetails cAccountDetails;
//    
//    private PropertyInfo cPropertyInfo;
//   
//    private GuarantorDetails cGuarantorDetails;
//
//    private EducationaInfo cEducationalInfo;

/**/
}
