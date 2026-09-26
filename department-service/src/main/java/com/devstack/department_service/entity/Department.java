package com.devstack.department_service.entity;

import jakarta.persistence.*;
import lombok.*;



@Entity
@Table(name = "department")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String departmentName;
    private String departDescription;
    private String departmentCode;


}
