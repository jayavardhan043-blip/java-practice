package com.example.restapi;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @GetMapping("/student")
    public Student getStudent() {

        Student student = new Student(
                1,
                "Jaya",
                "Java"
        );

        return student;
    }

    @GetMapping("/students")
    public List<Student> getStudents() {

        List<Student> students = new ArrayList<>();

        students.add(new Student(1, "Jaya", "Java"));
        students.add(new Student(2, "Rahul", "Python"));
        students.add(new Student(3, "Anu", "React"));

        return students;
    }
}