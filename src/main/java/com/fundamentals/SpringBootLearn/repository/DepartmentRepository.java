package com.fundamentals.SpringBootLearn.repository;

import com.fundamentals.SpringBootLearn.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
    public Department findByDepartmentNameIgnoreCase(String departmentName);

}
