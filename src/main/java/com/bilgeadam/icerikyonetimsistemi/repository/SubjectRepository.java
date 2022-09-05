package com.bilgeadam.icerikyonetimsistemi.repository;

import com.bilgeadam.icerikyonetimsistemi.repository.entity.Subject;
import com.bilgeadam.icerikyonetimsistemi.utility.MyFactoryRepository;

public class SubjectRepository extends MyFactoryRepository<Subject, Long> {

	public SubjectRepository() {
		super(new Subject());

	}

}
