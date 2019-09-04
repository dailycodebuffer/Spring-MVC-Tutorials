package com.dailycodebuffer.examples.SpringBootTutorial.controller;

import com.dailycodebuffer.examples.SpringBootTutorial.entity.Employee;
import com.dailycodebuffer.examples.SpringBootTutorial.exception.EmployeeIdMismatchException;
import com.dailycodebuffer.examples.SpringBootTutorial.exception.EmployeeNotFoundException;
import com.dailycodebuffer.examples.SpringBootTutorial.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/employee")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Employee create(Employee employee)
    {
        return employeeRepository.save(employee);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id)
    {
        employeeRepository.findById(id)
                .orElseThrow(EmployeeNotFoundException::new);
        employeeRepository.deleteById(id);
    }

    @PutMapping("/{id}")
    public Employee updateBook(@RequestBody Employee employee, @PathVariable Long id) {
        if (employee.getId() != id) {
            throw new EmployeeIdMismatchException();
        }
        employeeRepository.findById(id)
                .orElseThrow(EmployeeNotFoundException::new);
        return employeeRepository.save(employee);
    }


    @GetMapping("/{id}")
    public Employee find(@PathVariable Long id) {
        return employeeRepository.findById(id)
                .orElseThrow(EmployeeNotFoundException::new);
    }

    @GetMapping
    public Iterable findAll() {
        return employeeRepository.findAll();
    }


    @GetMapping("/email/{emailId}")
    public List findByTitle(@PathVariable String emailId) {
        return employeeRepository.findByEmailId(emailId);
    }

}
