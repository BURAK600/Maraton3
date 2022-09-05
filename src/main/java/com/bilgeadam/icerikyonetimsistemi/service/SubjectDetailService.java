package com.bilgeadam.icerikyonetimsistemi.service;

import com.bilgeadam.icerikyonetimsistemi.repository.SubjectDetailRepository;
import com.bilgeadam.icerikyonetimsistemi.repository.entity.SubjectDetail;
import com.bilgeadam.icerikyonetimsistemi.utility.MyFactoryService;

public class SubjectDetailService extends MyFactoryService<SubjectDetailRepository, SubjectDetail, Long> {

	public SubjectDetailService() {
		super(new SubjectDetailRepository());

	}

}
