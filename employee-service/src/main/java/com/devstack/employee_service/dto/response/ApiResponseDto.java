package com.devstack.employee_service.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class ApiResponseDto {
    private EmployeeResponseDto employeeDto;
    private DepartmentResponseDto departmentDto;
}
