package com.bilgeadam.icerikyonetimsistemi.service;

import com.bilgeadam.icerikyonetimsistemi.repository.LessonRepository;
import com.bilgeadam.icerikyonetimsistemi.repository.entity.Lesson;
import com.bilgeadam.icerikyonetimsistemi.utility.MyFactoryService;

public class LessonService extends MyFactoryService<LessonRepository, Lesson, Long> {

	public LessonService() {
		super(new LessonRepository());

	}

}
