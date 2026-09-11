package com.example.rest_api_practice.Controller;

import com.example.rest_api_practice.Controller.Employee;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;




@RestController 
@RequestMapping ("/employee")
public class EmployeeController {
    private List<Employee> employees = new ArrayList<>(
        List.of(
            new Employee(1, "Jaya", 21, "Software Engineer"),
            new Employee(2, "Rahul", 22, "Data Analyst"),
            new Employee(3, "Anil", 23, "Project Manager")
        ));

    //get

    @GetMapping
    public List<Employee> getAllEmployees() {
        return employees;
    }
    
    //post

    @PostMapping
    public Employee addEmployee(@RequestBody Employee employee) {
        employees.add(employee);
        return employee;
    }

    // get by iid

    @GetMapping("/{id}")
    public Employee getEmployee(@PathVariable int id) {
        for (Employee employee : employees){
            if (employee.getId() == id) {
                return employee;
            }
        }
        return null;
    }

    //put 
    @PutMapping("/{id}")
    public Employee updateEmployee(@PathVariable int id, @RequestBody Employee updatedEmployee) {
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                employee.setName(updatedEmployee.getName());
                employee.setAge(updatedEmployee.getAge());
                employee.setJobTitle(updatedEmployee.getJobTitle());
                return employee;
            }
    }
    return null;
    }

    // delete

    @DeleteMapping ("/{id}")
    public String deleteEmployee(@PathVariable int id) {
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                employees.remove(employee);
                return "Employee with ID " + id + " deleted successfully.";
            }
        }
        return "Employee with ID " + id + " not found.";
    }
}