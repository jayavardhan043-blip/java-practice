package com.example.springboot_masterclass;

public class Employee {
    private int id;
    private String name;
    private int age;
    private String jobTitle;

    // Default constructor
    public Employee() {
    }

    // Parameterized constructor
    public Employee(int id, String name, int age, String jobTitle) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.jobTitle = jobTitle; // fixed
    }

    // Getters and Setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getJobTitle() {
        return jobTitle; // fixed
    }
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle; // fixed
    }
}

 