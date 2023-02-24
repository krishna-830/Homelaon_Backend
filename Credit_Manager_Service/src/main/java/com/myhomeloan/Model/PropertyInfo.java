package com.myhomeloan.Model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class PropertyInfo {

	@Id
	   @GeneratedValue(strategy = GenerationType.AUTO)
	private int propertyid;
	private String propertytype;
	private String propertyArea;
	private String constructionArea;
	private double propertyprice;
	private double constructionprice;
	private byte[] propertyDocuments;
	private byte[] priceProofs;
	@OneToOne
	private propertyAddress propertyAddress;
}
