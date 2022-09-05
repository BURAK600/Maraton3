package com.bilgeadam.icerikyonetimsistemi.repository;

import com.bilgeadam.icerikyonetimsistemi.repository.entity.SubjectDetail;
import com.bilgeadam.icerikyonetimsistemi.utility.MyFactoryRepository;

public class SubjectDetailRepository extends MyFactoryRepository<SubjectDetail, Long> {

	public SubjectDetailRepository() {
		super(new SubjectDetail());

	}

}
