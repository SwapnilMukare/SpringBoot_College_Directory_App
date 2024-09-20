package com.service;



import com.model.FacultyProfile;
import com.repository.FacultyProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class FacultyProfileService {
    @Autowired
    private FacultyProfileRepository facultyProfileRepository;

    public Optional<FacultyProfile> findFacultyByUserId(Long userId) {
        return facultyProfileRepository.findById(userId);
    }

    public void saveFacultyProfile(FacultyProfile facultyProfile) {
        facultyProfileRepository.save(facultyProfile);
    }
}
