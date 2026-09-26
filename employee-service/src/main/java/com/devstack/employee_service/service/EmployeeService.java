package com.devstack.employee_service.service;

import com.devstack.employee_service.dto.request.EmployeeRequestDto;
import com.devstack.employee_service.dto.response.ApiResponseDto;
import com.devstack.employee_service.dto.response.EmployeeResponseDto;

public interface EmployeeService {
    EmployeeResponseDto saveEmployee(EmployeeRequestDto employeeRequestDto);

    ApiResponseDto getEmployeeById(Long id);
}
