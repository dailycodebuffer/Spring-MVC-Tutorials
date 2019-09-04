package com.dailycodebuffer.examples.springboothttpconverter.Controller;

import com.dailycodebuffer.examples.springboothttpconverter.Entity.Employee;
import com.dailycodebuffer.examples.springboothttpconverter.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @PostMapping(value = "/employee")
    public Employee createEmployee(@RequestBody Employee employee)
    {

        return  employeeRepository.save(employee);
    }

    @ResponseBody
    @GetMapping(value = "/employee/{id}")
    public Employee getEmployeeById(@PathVariable Long id)
    {

        return  employeeRepository.findById(id).get();
    }

    @PutMapping(value = "/employee")
    public Employee updateEmployee(@RequestBody Employee employee)
    {
        return  employeeRepository.existsById(employee.getId()) ? employeeRepository.save(employee) : null;
    }

    @DeleteMapping(value = "/employee/{id}")
    public void deleteEmployee(@PathVariable Long id)
    {
         employeeRepository.deleteById(id);
    }


}
