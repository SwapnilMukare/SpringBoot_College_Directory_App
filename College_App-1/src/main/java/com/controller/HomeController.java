package com.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.model.FacultyProfile;
import com.model.StudentProfile;
import com.model.User;
import com.service.UserService;

@Controller
public class HomeController {
    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String loginPage() {
    	System.out.println("login Page called");
        return "index";
    }

    @GetMapping("/studentDashboard")
    public String student() {
    	System.out.println("student Dasshboard Page called");
        return "studentDashboard";
    }

    @GetMapping("/facultyDashboard")
    public String faculty() {
    	System.out.println("faculty Dashboard Page called");
        return "facultyDashboard";
    }
    @GetMapping("/adminDashboard")
    public String admin() {
    	System.out.println("admin Dashboard  Page called");
        
        return "adminDashboard";
    }
    

    @PostMapping("/log")
    public String login(@RequestParam String username, @RequestParam String password, @RequestParam String role, Model model) {
    	
    	System.out.println("login call");
        Optional<User> user = userService.authenticateUser(username, password);
        if (user.isPresent()) {
            if (role.equalsIgnoreCase("STUDENT")) {
            	System.out.println("student call");
                StudentProfile student = userService.getStudentProfile(user.get().getId());
                model.addAttribute("student", student);
                return "studentDashboard";
            } else if (role.equalsIgnoreCase("FACULTY_MEMBER")) {
            	System.out.println("FACULTY call");
                FacultyProfile faculty = userService.getFacultyProfile(user.get().getId());
                model.addAttribute("faculty", faculty);
                return "facultyDashboard";
            } else {
            	System.out.println("admin call");
                return "adminDashboard";
            }
        } else {
            model.addAttribute("error", "Invalid username or password.");
            return "index";
        }
    }
}
