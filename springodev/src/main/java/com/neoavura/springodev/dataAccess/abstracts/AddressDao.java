package com.neoavura.springodev.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.neoavura.springodev.entities.concrete.Address;
import com.neoavura.springodev.entities.dtos.AddressDetail;


public interface AddressDao extends JpaRepository<Address, Integer>{
	
	@Query("Select new  com.neoavura.springodev.entities.dtos.AddressDetail(a.id, u.firstName, u.lastName, a.addressContent) From Address a Inner Join a.user u")
	List<AddressDetail> getAddressDetail();
	

}
