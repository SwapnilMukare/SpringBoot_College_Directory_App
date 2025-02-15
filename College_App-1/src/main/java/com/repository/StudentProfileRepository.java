package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.model.StudentProfile;

@Repository
public interface StudentProfileRepository extends JpaRepository<StudentProfile, Long> {}

