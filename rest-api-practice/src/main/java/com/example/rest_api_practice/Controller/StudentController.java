package com.example.rest_api_practice.Controller;

import com.example.rest_api_practice.Controller.Student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    @GetMapping("/students")
    public List<Student> getStudents() {

        List<Student> students = new ArrayList<>();

        students.add(new Student(1, "Jaya", 21));
        students.add(new Student(2, "Rahul", 22));
        students.add(new Student(3, "Anil", 23));

        return students;
    }
}