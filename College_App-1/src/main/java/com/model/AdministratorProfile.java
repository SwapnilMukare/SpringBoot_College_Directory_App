package com.model;

import javax.persistence.*;


@Entity

public class AdministratorProfile {
    @Id
    private Long userId;

    @OneToOne
    @MapsId
    @JoinColumn(name = "user_id")
    private User user;

    private String photo;

    @ManyToOne
    @JoinColumn(name = "department_id", nullable = false)
    private Department department;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
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

	@Override
	public String toString() {
		return "AdministratorProfile [userId=" + userId + ", user=" + user + ", photo=" + photo + ", department="
				+ department + "]";
	}

	public AdministratorProfile(Long userId, User user, String photo, Department department) {
		super();
		this.userId = userId;
		this.user = user;
		this.photo = photo;
		this.department = department;
	}

	public AdministratorProfile() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
}
