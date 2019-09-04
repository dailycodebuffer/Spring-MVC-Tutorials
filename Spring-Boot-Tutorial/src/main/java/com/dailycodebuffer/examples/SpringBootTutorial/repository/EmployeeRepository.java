package com.dailycodebuffer.examples.SpringBootTutorial.repository;

import com.dailycodebuffer.examples.SpringBootTutorial.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository  extends JpaRepository<Employee, Long> {

    List<Employee> findByEmailId(String emailId);
}
