package com.devstack.employee_service.dto.request;

import jakarta.persistence.*;
import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class EmployeeRequestDto {
    private String firstName;
    private String lastName;
    private String email;
    private String departmentCode;
}
