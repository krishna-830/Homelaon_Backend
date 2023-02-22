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
@AllArgsConstructor
@NoArgsConstructor
public class Ledger {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int ledgerId;
  private String ledgerCreatedDate;
  private Double totalLoanAmount;
  private Double payableAmountwithInterest;
  private int tenure;
  private Double monlyEMI;
  private Double amountPaidTillDate;
  private Double remainingAmount;
  private String nextEmiDatestart;
  private String nextEmiDateEnd;
  private int defaulterCount;
  private String previousEmiStatus;
  private String currentMonthEmiStatus;
  private String loanEndDate;
  private String loanStatus;
  
	
}
