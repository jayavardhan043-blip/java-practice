package com.example.rest_api_practice.Controller;

public class Employee {
    private int id;
    private String name;
    private int age;
    private String jobTitle;

    public Employee () {
    }
        public Employee(int id, String name, int age, String jobTitle) {
            this.id = id;
            this.name = name;
            this.age = age;
            this.jobTitle = jobTitle;
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
        public String getJobTitle() {
            return jobTitle;
        }
}
