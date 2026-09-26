package com.devstack.employee_service.dto.response;


import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class EmployeeResponseDto {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String departmentCode;
}
