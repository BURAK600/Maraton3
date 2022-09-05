package com.bilgeadam.icerikyonetimsistemi.repository.entity;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tblsubject")
public class Subject {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long id;

	@ManyToOne(cascade = CascadeType.ALL)
	private Lesson lesson;

	private LocalDate createAt;

	private LocalDate updatedAt;

	private boolean enabled;

	@OneToOne(cascade = CascadeType.ALL)
	SubjectDetail subjectDetail;

	public Subject() {
		super();
	}

	public Subject(Lesson lesson, LocalDate createAt, LocalDate updatedAt, boolean enabled) {
		super();
		this.lesson = lesson;
		this.createAt = createAt;
		this.updatedAt = updatedAt;
		this.enabled = enabled;
	}

	public Subject(long id, Lesson lesson, LocalDate createAt, LocalDate updatedAt, boolean enabled) {
		super();
		this.id = id;
		this.lesson = lesson;
		this.createAt = createAt;
		this.updatedAt = updatedAt;
		this.enabled = enabled;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Lesson getLesson() {
		return lesson;
	}

	public void setLesson(Lesson lesson) {
		this.lesson = lesson;
	}

	public LocalDate getCreateAt() {
		return createAt;
	}

	public void setCreateAt(LocalDate createAt) {
		this.createAt = createAt;
	}

	public LocalDate getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(LocalDate updatedAt) {
		this.updatedAt = updatedAt;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	@Override
	public String toString() {
		return "Subject [id=" + id + ", lesson=" + lesson + ", createAt=" + createAt + ", updatedAt=" + updatedAt
				+ ", enabled=" + enabled + "]";
	}

}
