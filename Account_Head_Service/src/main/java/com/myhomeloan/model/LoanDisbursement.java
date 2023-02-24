package com.myhomeloan.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LoanDisbursement {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int agrrmentid;
	private int loannumber;
	private String agrrdate;
	private String ammoutpaytype;
	private double totalammout;
	private String bankname;
	private double aacountnumber;
	private String ifsccode;
	private String accounttype;
	private double transferammout;
	private String paymentstatus;
	private String ammoutpaydate;
	
}
