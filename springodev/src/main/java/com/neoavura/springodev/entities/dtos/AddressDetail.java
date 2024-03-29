package com.neoavura.springodev.entities.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddressDetail {
	private int id;
	private String firstName;
	private String lastName;
	private String addressContent;
}
