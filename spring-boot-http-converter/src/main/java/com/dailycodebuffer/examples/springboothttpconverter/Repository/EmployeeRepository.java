package com.dailycodebuffer.examples.springboothttpconverter.Repository;


import com.dailycodebuffer.examples.springboothttpconverter.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {


}
