package com.neoavura.springodev.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neoavura.springodev.business.abstracts.AddressService;
import com.neoavura.springodev.core.utilities.results.DataResult;
import com.neoavura.springodev.core.utilities.results.Result;
import com.neoavura.springodev.entities.concrete.Address;
import com.neoavura.springodev.entities.dtos.AddressDetail;




@RestController
@RequestMapping("/api/addresses")
public class AddressController {

	private AddressService addressService;

	@Autowired
	public AddressController(AddressService addressService) {
		super();
		this.addressService = addressService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<Address>> getAll(){
		return this.addressService.getAll();
	}
	
	@GetMapping("/getalldetail")
	public DataResult<List<AddressDetail>> getAllDetail(){
		return this.addressService.getAdressDetail();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Address address) {
		return this.addressService.add(address);
	}
	
	@PostMapping("/update")
	public Result update(@RequestBody Address address) {
		return this.addressService.update(address);
	}
	
	@PostMapping("/delete")
	public Result delete(@RequestBody Address address) {
		return this.addressService.delete(address);
	}
}
