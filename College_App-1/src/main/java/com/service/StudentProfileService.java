package com.service;

import com.model.StudentProfile;
import com.repository.StudentProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class StudentProfileService {
    @Autowired
    private StudentProfileRepository studentProfileRepository;

   
    public void saveStudentProfile(StudentProfile studentProfile) {
        studentProfileRepository.save(studentProfile);
    }

	public Object findAllStudents() {
		
		return studentProfileRepository.findAll();
	}

	public Object findStudentByUserId(Long userId) {
		
		return studentProfileRepository.findById(userId);
	}
}
