package com.bilgeadam.icerikyonetimsistemi.service;

import com.bilgeadam.icerikyonetimsistemi.repository.AnswerRepository;
import com.bilgeadam.icerikyonetimsistemi.repository.entity.Answer;
import com.bilgeadam.icerikyonetimsistemi.utility.MyFactoryService;

public class AnswerService extends MyFactoryService<AnswerRepository, Answer, Long> {

	public AnswerService() {
		super(new AnswerRepository());

	}

}
