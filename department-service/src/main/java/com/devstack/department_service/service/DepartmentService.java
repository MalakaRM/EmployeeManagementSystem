package com.devstack.department_service.service;

import com.devstack.department_service.dto.request.DepartmentRequestDto;
import com.devstack.department_service.dto.response.DepartmentResponseDto;

public interface DepartmentService {
    DepartmentResponseDto saveDepartment(DepartmentRequestDto departmentDto);
    DepartmentResponseDto getDepartmentByCode(String departmentCode);
}
