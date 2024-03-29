package com.neoavura.springodev.business.concrete;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neoavura.springodev.business.abstracts.UserService;
import com.neoavura.springodev.core.utilities.results.DataResult;
import com.neoavura.springodev.core.utilities.results.Result;
import com.neoavura.springodev.core.utilities.results.SuccessDataResult;
import com.neoavura.springodev.core.utilities.results.SuccessResult;
import com.neoavura.springodev.dataAccess.abstracts.UserDao;
import com.neoavura.springodev.entities.concrete.User;

@Service
public class UserManager implements UserService {

	private UserDao userDao;

	@Autowired 
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public DataResult<List<User>> getAll() {
		return new SuccessDataResult<List<User>>(this.userDao.findAll(), "Kullanıcılar başarıyla listelendi.");
	}

	@Override
	public Result add(User user) {
		this.userDao.save(user);
		return new SuccessResult("Kullanıcı başarıyla eklendi");
	}

	@Override
	public Result update(User user) {
		this.userDao.save(user);
		return new SuccessResult("Kullanıcı bilgisi güncellendi");
		
	}

	@Override
	public Result delete(User user) {
		this.userDao.delete(user);
		return new SuccessResult("Kullanıcı başarıyla silindi");
	}

}
