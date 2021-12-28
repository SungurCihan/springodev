package com.neoavura.springodev.business.abstracts;

import java.util.List;

import com.neoavura.springodev.core.utilities.results.DataResult;
import com.neoavura.springodev.core.utilities.results.Result;
import com.neoavura.springodev.entities.concrete.Address;
import com.neoavura.springodev.entities.dtos.AddressDetail;

public interface AddressService {
	DataResult<List<Address>> getAll();
	DataResult<List<AddressDetail>> getAdressDetail();
	Result add(Address address);
	Result update(Address address);
	Result delete(Address address);
}
