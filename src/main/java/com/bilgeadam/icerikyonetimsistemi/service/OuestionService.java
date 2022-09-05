package com.bilgeadam.icerikyonetimsistemi.service;

import com.bilgeadam.icerikyonetimsistemi.repository.QuestionRepository;
import com.bilgeadam.icerikyonetimsistemi.repository.entity.Question;
import com.bilgeadam.icerikyonetimsistemi.utility.MyFactoryService;

public class OuestionService extends MyFactoryService<QuestionRepository, Question, Long> {

	public OuestionService() {
		super(new QuestionRepository());

	}

}
