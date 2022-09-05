package com.bilgeadam.icerikyonetimsistemi.repository.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tbluser")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long id;
	private String name;
	private String surname;

	@Enumerated(EnumType.STRING)
	private Role role;

	private LocalDate createAt;
	private LocalDate updatedAt;
	private boolean enabled;

	@OneToMany()
	List<SubjectDetail> subjectDetails;

	public User(long id, String name, String surname, Role role, LocalDate createAt, LocalDate updatedAt,
			boolean enabled) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.role = role;
		this.createAt = createAt;
		this.updatedAt = updatedAt;
		this.enabled = enabled;
	}

	public User(String name, String surname, Role role, LocalDate createAt, LocalDate updatedAt, boolean enabled) {
		super();
		this.name = name;
		this.surname = surname;
		this.role = role;
		this.createAt = createAt;
		this.updatedAt = updatedAt;
		this.enabled = enabled;
	}

	public User() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
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
		return "User [id=" + id + ", name=" + name + ", surname=" + surname + ", role=" + role + ", createAt="
				+ createAt + ", updatedAt=" + updatedAt + ", enabled=" + enabled + "]";
	}

}
