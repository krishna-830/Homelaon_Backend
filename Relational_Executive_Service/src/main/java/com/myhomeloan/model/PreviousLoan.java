package com.myhomeloan.model;

<<<<<<< HEAD
import javax.persistence.Entity;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PreviousLoan {
	private int ploanId;
	private double ploanAmount;
	private int pTenure;
	private double paidAmount;
	private double remainingAmount;
	private int deafulterCount;
	@OneToOne
	private PreviousLoanBank pbankDetails;
	private String status;
	private String remark;

=======
public class PreviousLoan {
>>>>>>> f3488dfea21c6dd9e224253d2f4b344759f8860b

}
