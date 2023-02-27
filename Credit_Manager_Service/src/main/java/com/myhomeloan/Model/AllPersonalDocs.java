package com.myhomeloan.Model;

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
public class AllPersonalDocs {
	
	@Id
//	   @GeneratedValue(strategy = GenerationType.AUTO)
	private int documentID;
	private byte[] addressproof;
	private byte[] pancard;
	private byte[] itr;
	private byte[] addharCard;
	private byte[] photo;
	private byte[] signature;
	private byte[] bankcheque;
	private byte[] salaryslips;
	
			

}
