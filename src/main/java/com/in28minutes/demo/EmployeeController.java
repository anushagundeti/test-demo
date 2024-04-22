package com.in28minutes.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @PostMapping("/add")
    public String addEmployee(@RequestParam String first, @RequestParam String last) {
        Employee employee = new Employee();
        employee.setFirstName(first);
        employee.setLastName(last);
        employeeRepository.save(employee);
        return "Added new employee to repo!";
    }

    @GetMapping("/employees")
    public Iterable<Employee> getEmployee() {
        return employeeRepository.findAll();
    }


}