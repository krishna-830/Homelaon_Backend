package com.myhomeloan.model;

<<<<<<< HEAD
import javax.persistence.Entity;
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
=======
public class PropertyInfo {

>>>>>>> f3488dfea21c6dd9e224253d2f4b344759f8860b
}
