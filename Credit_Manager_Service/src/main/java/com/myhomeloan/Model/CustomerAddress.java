package com.myhomeloan.Model;


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
public class CustomerAddress {

	@Id
	private int addressid;
	@OneToOne
	private permanent permanent;
	@OneToOne
	private local local;

}
