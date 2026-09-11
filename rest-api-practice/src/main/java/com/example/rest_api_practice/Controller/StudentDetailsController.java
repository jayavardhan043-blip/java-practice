package com.example.rest_api_practice.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentDetailsController {

    @GetMapping("/StudentDetails")
    public StudentDetails getStudentDetails() {

        return new StudentDetails(1, "Jaya", 21, "Computer Science");
    }
}