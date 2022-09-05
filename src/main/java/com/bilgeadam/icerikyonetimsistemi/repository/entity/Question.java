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
@Table(name = "tblquestion")
public class Question {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long id;

	@ManyToOne

	private SubjectDetail subjectDetail;

	private String title;

	private String question;

	private LocalDate createAt;

	private LocalDate updatedAt;

	private boolean enabled;

	@OneToOne(cascade = CascadeType.ALL)
	private Answer answer;

	public Question() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Question(String title, String question, LocalDate createAt, LocalDate updatedAt, boolean enabled,
			Answer answer) {
		super();
		this.title = title;
		this.question = question;
		this.createAt = createAt;
		this.updatedAt = updatedAt;
		this.enabled = enabled;
		this.answer = answer;
	}

	public SubjectDetail getSubjectDetail() {
		return subjectDetail;
	}

	public void setSubjectDetail(SubjectDetail subjectDetail) {
		this.subjectDetail = subjectDetail;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
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
		return "Question [id=" + id + ", title=" + title + ", question=" + question + ", createAt=" + createAt
				+ ", updatedAt=" + updatedAt + ", enabled=" + enabled + ", answer=" + answer + "]";
	}

}
