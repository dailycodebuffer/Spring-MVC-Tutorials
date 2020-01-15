package com.dailycodebuffer.demo.service;

import com.dailycodebuffer.demo.dao.EmployeeDAO;
import com.dailycodebuffer.demo.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeDAO employeeDAO;

    public int addEmployee(Employee emp)
    {
       return employeeDAO.addEmployee(emp);
    }

    public List<Employee> getAllEmployees()
    {
        return employeeDAO.getAllEmployees();
    }

    public Employee getEmployee(int id)
    {
        return employeeDAO.getEmployee(id);
    }

    public int deleteEmployee(int id)
    {
        return employeeDAO.deleteEmployee(id);
    }
}
