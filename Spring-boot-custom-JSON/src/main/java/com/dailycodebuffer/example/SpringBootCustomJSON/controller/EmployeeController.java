package com.dailycodebuffer.example.SpringBootCustomJSON.controller;

import com.dailycodebuffer.example.SpringBootCustomJSON.model.Employee;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    @RequestMapping("/getEmployees")
    public List<Employee> getEmployees() {
        return Employee.getEmployee();
    }
}
