package com.bilgeadam.icerikyonetimsistemi.service;

import com.bilgeadam.icerikyonetimsistemi.repository.UserRepository;
import com.bilgeadam.icerikyonetimsistemi.repository.entity.User;
import com.bilgeadam.icerikyonetimsistemi.utility.MyFactoryService;

public class UserService extends MyFactoryService<UserRepository, User, Long> {

	public UserService() {
		super(new UserRepository());

	}

}
