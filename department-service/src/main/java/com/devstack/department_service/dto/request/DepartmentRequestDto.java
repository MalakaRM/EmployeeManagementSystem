package com.devstack.department_service.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class DepartmentRequestDto {
    private String departmentName;
    private String departDescription;
    private String departmentCode;

}
