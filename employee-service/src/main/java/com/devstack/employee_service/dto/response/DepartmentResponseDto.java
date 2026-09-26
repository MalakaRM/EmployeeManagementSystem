package com.devstack.employee_service.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class DepartmentResponseDto {
    private Long id;
    private String departmentName;
    private String departDescription;
    private String departmentCode;

}
