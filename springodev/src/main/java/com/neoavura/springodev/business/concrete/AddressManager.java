package com.neoavura.springodev.business.concrete;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neoavura.springodev.business.abstracts.AddressService;
import com.neoavura.springodev.core.utilities.results.DataResult;
import com.neoavura.springodev.core.utilities.results.Result;
import com.neoavura.springodev.core.utilities.results.SuccessDataResult;
import com.neoavura.springodev.core.utilities.results.SuccessResult;
import com.neoavura.springodev.dataAccess.abstracts.AddressDao;
import com.neoavura.springodev.entities.concrete.Address;
import com.neoavura.springodev.entities.dtos.AddressDetail;

@Service
public class AddressManager implements AddressService{
	
	private AddressDao addressDao;

	@Autowired 
	public AddressManager(AddressDao addressDao) {
		super();
		this.addressDao = addressDao;
	}

	@Override
	public DataResult<List<Address>> getAll() {
		return new SuccessDataResult<List<Address>>(this.addressDao.findAll(), "Address bilgileri geitirildi");
	}

	@Override
	public DataResult<List<AddressDetail>> getAdressDetail() {
		return new SuccessDataResult<List<AddressDetail>>(this.addressDao.getAddressDetail(), "Kullanıcı detaylar getirildi.");
	}

	@Override
	public Result add(Address address) {
		this.addressDao.save(address);
		return new SuccessResult("Adress bilgisi başarıyle eklendi.");
	}

	@Override
	public Result update(Address address) {
		this.addressDao.save(address);
		return new SuccessResult("Adress bilgisi başarıyle güncellendi.");
	}

	@Override
	public Result delete(Address address) {
		this.addressDao.delete(address);
		return new SuccessResult("Adress bilgisi başarıyle silindi.");
	}
}
