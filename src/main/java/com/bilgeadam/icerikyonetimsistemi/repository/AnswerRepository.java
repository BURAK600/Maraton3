package com.bilgeadam.icerikyonetimsistemi.repository;

import com.bilgeadam.icerikyonetimsistemi.repository.entity.Answer;
import com.bilgeadam.icerikyonetimsistemi.utility.MyFactoryRepository;

public class AnswerRepository extends MyFactoryRepository<Answer, Long> {

	public AnswerRepository() {
		super(new Answer());

	}

}
