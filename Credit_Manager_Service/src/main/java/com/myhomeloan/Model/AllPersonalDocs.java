package com.myhomeloan.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AllPersonalDocs {
	
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
