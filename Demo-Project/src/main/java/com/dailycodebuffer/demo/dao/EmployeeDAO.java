package com.dailycodebuffer.demo.dao;

import com.dailycodebuffer.demo.model.Employee;

import java.util.List;

public interface EmployeeDAO {

    int addEmployee(Employee emp);

    List<Employee> getAllEmployees();

    Employee getEmployee(int id);

    int deleteEmployee(int id);

    int updateEmployee(int id, Employee emp);
}
