package com.bilgeadam.icerikyonetimsistemi.service;

import com.bilgeadam.icerikyonetimsistemi.repository.SubjectRepository;
import com.bilgeadam.icerikyonetimsistemi.repository.entity.Subject;
import com.bilgeadam.icerikyonetimsistemi.utility.MyFactoryService;

public class SubjectService extends MyFactoryService<SubjectRepository, Subject, Long> {

	public SubjectService() {
		super(new SubjectRepository());

	}

}
