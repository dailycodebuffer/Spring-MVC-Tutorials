package com.dailycodebuffer.demo.dao;

import com.dailycodebuffer.demo.model.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO{

    List<Employee> employees = new ArrayList<>();

    @Override
    public int addEmployee(Employee emp) {
        employees.add(emp);
        return 1;
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employees;
    }

    @Override
    public Employee getEmployee(int id) {
        for (Employee emp: employees) {
            if(emp.getEmpId() == id)
                return emp;
        }
        return null;
    }

    @Override
    public int deleteEmployee(int id) {

        Employee empTODelete = null;

        for(Employee emp : employees)
        {
            if(emp.getEmpId() == id)
                empTODelete = emp;
        }

        if(empTODelete !=null)
        {
            employees.remove(empTODelete);
            return  1;
        }
        else
        {
            return 0;
        }
    }

    @Override
    public int updateEmployee(int id, Employee emp) {
        return 0;
    }
}
