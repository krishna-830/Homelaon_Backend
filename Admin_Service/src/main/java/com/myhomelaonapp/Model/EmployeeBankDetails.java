package com.myhomelaonapp.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeBankDetails {

	@GeneratedValue(strategy = GenerationType.AUTO)
	private int bankid;
	private String bankname;
	private String branchname;
	private String ifsccode;
	private long contact;
	@OneToOne
	private Bankaddress bankadd;
}
