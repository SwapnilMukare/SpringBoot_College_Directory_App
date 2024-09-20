package com.service;

import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Service;

import com.model.*;
import com.repository.*;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    
    @Autowired
    private StudentProfileRepository studentProfileRepository;
    
    @Autowired
    private FacultyProfileRepository facultyProfileRepository;

    public Optional<User> authenticateUser(String username, String password) {
        Optional<User> user = userRepository.findByUsername(username);
        if (user.isPresent() && user.get().getPassword().equals(password)) {
            return user;
        }
        return Optional.empty();
    }

    public StudentProfile getStudentProfile(Long userId) {
        return studentProfileRepository.findById(userId).orElse(null);
    }

    public FacultyProfile getFacultyProfile(Long userId) {
        return facultyProfileRepository.findById(userId).orElse(null);
    }
}

