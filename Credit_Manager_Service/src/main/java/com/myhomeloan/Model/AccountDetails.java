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
public class AccountDetails {
	
	private String branchName;
    private double branchCode;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int branchId;
    private String ifsc;
    private String micrCode;
    private double contactNO;
    @OneToOne(cascade = CascadeType.ALL)
    private BankAddress branchAddress;
    private String email; 
    private String status;
	

}
