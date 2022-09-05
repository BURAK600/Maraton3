package com.bilgeadam.icerikyonetimsistemi.repository;

import com.bilgeadam.icerikyonetimsistemi.repository.entity.Question;
import com.bilgeadam.icerikyonetimsistemi.utility.MyFactoryRepository;

public class QuestionRepository extends MyFactoryRepository<Question, Long> {

	public QuestionRepository() {
		super(new Question());

	}

}
