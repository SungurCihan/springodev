package com.neoavura.springodev.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.neoavura.springodev.entities.concrete.User;

public interface UserDao extends JpaRepository<User, Integer>{

}
