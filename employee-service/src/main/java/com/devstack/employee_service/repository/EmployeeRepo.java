package com.devstack.employee_service.repository;

import com.devstack.employee_service.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
public interface EmployeeRepo extends JpaRepository<Employee,Long> {
}
