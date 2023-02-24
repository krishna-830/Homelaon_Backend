package com.myhomelaonapp.Model;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {
    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int addressid;
	private String areaname;
	private String cityname;
	private int pincode;
}
