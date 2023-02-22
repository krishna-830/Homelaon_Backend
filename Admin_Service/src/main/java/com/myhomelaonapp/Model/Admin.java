package com.myhomelaonapp.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Admin {

	
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int adminid;
	private String username;
	private String password;
	
	
}
