package com.example.rest_api_practice.Controller;

public class StudentDetails {
    private int id;
    private String name;
    private int age;
    private String course;

    public StudentDetails(int id, String name, int age, String course) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;
    }
    
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCourse() {
        return course;
    }
}
