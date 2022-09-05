package com.bilgeadam.icerikyonetimsistemi.repository.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tbllesson")
public class Lesson {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long id;

	private String lessonName;

	private String description;

	private LocalDate createAt;

	private LocalDate updatedAt;

	private boolean enabled;

	@OneToMany(mappedBy = "lesson")
	List<Subject> subjects;

	public Lesson() {
		super();
	}

	public Lesson(String lessonName, String description, LocalDate createAt, LocalDate updatedAt, boolean enabled) {
		super();
		this.lessonName = lessonName;
		this.description = description;
		this.createAt = createAt;
		this.updatedAt = updatedAt;
		this.enabled = enabled;
	}

	public Lesson(long id, String lessonName, String description, LocalDate createAt, LocalDate updatedAt,
			boolean enabled) {
		super();
		this.id = id;
		this.lessonName = lessonName;
		this.description = description;
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

	public String getLessonName() {
		return lessonName;
	}

	public void setLessonName(String lessonName) {
		this.lessonName = lessonName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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
		return "Lesson [id=" + id + ", lessonName=" + lessonName + ", description=" + description + ", createAt="
				+ createAt + ", updatedAt=" + updatedAt + ", enabled=" + enabled + "]";
	}

}
