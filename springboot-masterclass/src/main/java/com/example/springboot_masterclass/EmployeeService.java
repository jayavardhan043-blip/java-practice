package com.example.springboot_masterclass;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    private final List<Employee> employees = new ArrayList<>();

    public EmployeeService() {
        employees.add(new Employee(1, "Jaya", 21, "Software Engineer"));
        employees.add(new Employee(2, "Rahul", 22, "Data Analyst"));
        employees.add(new Employee(3, "Anil", 23, "Project Manager"));
    }

    public List<Employee> getAllEmployees() {
        return employees;
    }

    public Employee getEmployeeById(int id) {
        return employees.stream()
                .filter(e -> e.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public Employee createEmployee(Employee employee) {

    employees.add(employee);

    return employee;
}

public boolean deleteEmployee(int id) {

    return employees.removeIf(
        employee -> employee.getId() == id);
}

public Employee updateEmployee(
        int id,
        Employee updatedEmployee) {

    Employee existing =
            getEmployeeById(id);

    if (existing == null) {
        return null;
    }

    existing.setName(
        updatedEmployee.getName()
    );

    existing.setAge(
        updatedEmployee.getAge()
    );

    existing.setJobTitle(
        updatedEmployee.getJobTitle()
    );

    return existing;
}
}

