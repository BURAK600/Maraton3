package com.bilgeadam.icerikyonetimsistemi.repository;

import com.bilgeadam.icerikyonetimsistemi.repository.entity.Lesson;
import com.bilgeadam.icerikyonetimsistemi.utility.MyFactoryRepository;

public class LessonRepository extends MyFactoryRepository<Lesson, Long> {

	public LessonRepository() {
		super(new Lesson());

	}

}
