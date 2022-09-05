package com.bilgeadam.icerikyonetimsistemi.repository.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tblsubjectdetail")
public class SubjectDetail {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long id;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "subject_id", referencedColumnName = "id")
	private Subject subject;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "user_id", referencedColumnName = "id")
	private User user;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "subjectDetail")
	List<Question> questions;

	private String title;

	private String description;

	private String article;

	private LocalDate createAt;

	private LocalDate updatedAt;

	private boolean enabled;

	public SubjectDetail() {
		super();
	}

	public SubjectDetail(Subject subject, User user, List<Question> questions, String title, String description,
			String article, LocalDate createAt, LocalDate updatedAt, boolean enabled) {
		super();
		this.subject = subject;
		this.user = user;
		this.questions = questions;
		this.title = title;
		this.description = description;
		this.article = article;
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

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getArticle() {
		return article;
	}

	public void setArticle(String article) {
		this.article = article;
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
		return "SubjectDetail [id=" + id + ", subject=" + subject + ", user=" + user + ", questions=" + questions
				+ ", title=" + title + ", description=" + description + ", article=" + article + ", createAt="
				+ createAt + ", updatedAt=" + updatedAt + ", enabled=" + enabled + "]";
	}

}
