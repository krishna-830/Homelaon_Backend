package com.myhomelaonapp.Model;

import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {

	@GeneratedValue(strategy = GenerationType.AUTO)
	private int addressid;
	private String areaname;
	private String cityname;
	private int pincode;
}