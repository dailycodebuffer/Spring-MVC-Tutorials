package com.dailycodebuffer.demo.controller;

import com.dailycodebuffer.demo.model.Employee;
import com.dailycodebuffer.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/employee")
@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping
    public int addEmployee(@RequestBody Employee emp)
    {
        return employeeService.addEmployee(emp);
    }

    @GetMapping
    public List<Employee> getAllEmployees()
    {
        return employeeService.getAllEmployees();
    }

    @GetMapping(path = "{id}")
    public Employee getEmployee(@PathVariable("id") int id)
    {
        return employeeService.getEmployee(id);
    }

    @DeleteMapping(path = "{id}")
    public int deleteEmployee(@PathVariable("id") int id)
    {
        return  employeeService.deleteEmployee(id);
    }
}
