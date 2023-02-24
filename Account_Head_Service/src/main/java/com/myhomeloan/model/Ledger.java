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
public class Ledger {


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int ledgerid;
	private String ledgercreateddate;
	private double totalloanamout;
	private double payableammoutwithinterest;
	private int tenure;
	private double monthlyemi;
	private double ammoutpaidtilldate;
	private double remainingammout;
	private String nextemidatestart;
	private String nextemidateend;
	private int defaultercount;
	private String previousemistatus;
	private String currentmonthemistatus;
	private String loanendate;
	private String loanstatus;
	
}
