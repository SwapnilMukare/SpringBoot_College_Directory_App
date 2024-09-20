package com.model;

import javax.persistence.*;

@Entity
@Table(name = "student_profiles")
public class StudentProfile {
    @Id
    private Long userId;

    private String photo;

    @ManyToOne
    @JoinColumn(name = "department_id", nullable = false)
    private Department department;

    private String year;

    @OneToOne
    @MapsId
    @JoinColumn(name = "user_id")
    private User user;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "StudentProfile [userId=" + userId + ", photo=" + photo + ", department=" + department + ", year=" + year
				+ ", user=" + user + "]";
	}

	public StudentProfile(Long userId, String photo, Department department, String year, User user) {
		super();
		this.userId = userId;
		this.photo = photo;
		this.department = department;
		this.year = year;
		this.user = user;
	}

	public StudentProfile() {
		super();
		// TODO Auto-generated constructor stub
	}

    
    
}