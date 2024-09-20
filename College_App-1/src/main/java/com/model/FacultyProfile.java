package com.model;

import javax.persistence.*;
@Entity
@Table(name = "faculty_profiles")
public class FacultyProfile {
    @Id
    private Long userId;

    private String photo;
    private String officeHours;

    @ManyToOne
    @JoinColumn(name = "department_id", nullable = false)
    private Department department;

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

	public String getOfficeHours() {
		return officeHours;
	}

	public void setOfficeHours(String officeHours) {
		this.officeHours = officeHours;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "FacultyProfile [userId=" + userId + ", photo=" + photo + ", officeHours=" + officeHours
				+ ", department=" + department + ", user=" + user + "]";
	}

	public FacultyProfile(Long userId, String photo, String officeHours, Department department, User user) {
		super();
		this.userId = userId;
		this.photo = photo;
		this.officeHours = officeHours;
		this.department = department;
		this.user = user;
	}

	public FacultyProfile() {
		super();
		// TODO Auto-generated constructor stub
	}
    

    

}