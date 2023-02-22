package com.myhomelaonapp.Model;

import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Bankaddress {

	@GeneratedValue(strategy = GenerationType.AUTO)
	private int aid;
	private String areaname;
	private String cityname;
	private String state;
	private int pincode;
	
}
