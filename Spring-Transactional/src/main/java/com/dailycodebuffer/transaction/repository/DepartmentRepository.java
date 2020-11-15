package com.dailycodebuffer.transaction.repository;

import com.dailycodebuffer.transaction.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
