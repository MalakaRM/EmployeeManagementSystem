package com.devstack.employee_service.service;

import com.devstack.employee_service.dto.response.DepartmentResponseDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(url = "http://localhost:8081/api/v1/departments/" ,value = "DEPARTMENT-SERVICE")
public interface APIClient {
    @GetMapping("{department-code}")
    DepartmentResponseDto getDepartment(@PathVariable(value = "department-code") String departmentCode);




}
