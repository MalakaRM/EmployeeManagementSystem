package com.devstack.department_service.repository;

import com.devstack.department_service.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
public interface DepartmentRepo  extends JpaRepository<Department,Long> {
    Department findByDepartmentCode(String departmentCode);
}
