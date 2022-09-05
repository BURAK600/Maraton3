package com.bilgeadam.icerikyonetimsistemi.repository.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tbluanswer")
public class Answer {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)

	private long id;

	@OneToOne
	private Question question;

//	@ManyToMany()
//	private User user;

	private String answer;

	private LocalDate createAt;

	private LocalDate updatedAt;

	private boolean enabled;

	public Answer() {
		super();
	}

	public Answer(String answer, LocalDate createAt, LocalDate updatedAt, boolean enabled) {
		super();
		this.answer = answer;
		this.createAt = createAt;
		this.updatedAt = updatedAt;
		this.enabled = enabled;
	}

	public Answer(long id, Question question, String answer, LocalDate createAt, LocalDate updatedAt, boolean enabled) {
		super();
		this.id = id;
		this.question = question;
		this.answer = answer;
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

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

//	public User getUser() {
//		return user;
//	}
//
//	public void setUser(User user) {
//		this.user = user;
//	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
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
		return "Answer [id=" + id + ", question=" + question + ", answer=" + answer + ", createAt=" + createAt
				+ ", updatedAt=" + updatedAt + ", enabled=" + enabled + "]";
	}

}
