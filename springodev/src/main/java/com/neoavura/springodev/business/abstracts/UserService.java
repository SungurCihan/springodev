package com.neoavura.springodev.business.abstracts;

import java.util.List;

import com.neoavura.springodev.core.utilities.results.DataResult;
import com.neoavura.springodev.core.utilities.results.Result;
import com.neoavura.springodev.entities.concrete.User;

public interface UserService
{
	DataResult<List<User>> getAll();
	Result add(User user);
	Result update(User user);
	Result delete(User user);
}
