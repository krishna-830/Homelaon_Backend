package com.myhomeloan.model;

<<<<<<< HEAD
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GuarantorDetails {
	@Id
	private int gid;
	private String gName; 
	private String gDateofBirth;
	private String gRelationshipwithCustomer;
	private double gMobNo;
	private double gAdharCardNo;
	private String gMortgageDetails;
	private String gloaclAddress;
	private String gPermanentAddress;
=======
public class GuarantorDetails {
>>>>>>> f3488dfea21c6dd9e224253d2f4b344759f8860b

}
