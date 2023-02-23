package com.myhomelaonapp.Model;


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
public class Bankaddress {
    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int aid;
	private String areaname;
	private String cityname;
	private String state;
	private int pincode;
	
}
