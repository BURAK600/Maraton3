package com.bilgeadam.icerikyonetimsistemi.repository;

import com.bilgeadam.icerikyonetimsistemi.repository.entity.User;
import com.bilgeadam.icerikyonetimsistemi.utility.MyFactoryRepository;

public class UserRepository extends MyFactoryRepository<User, Long> {

	public UserRepository() {
		super(new User());

	}

}
