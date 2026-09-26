package com.devstack.department_service.service.impl;

import com.devstack.department_service.dto.request.DepartmentRequestDto;
import com.devstack.department_service.dto.response.DepartmentResponseDto;
import com.devstack.department_service.entity.Department;
import com.devstack.department_service.repository.DepartmentRepo;
import com.devstack.department_service.service.DepartmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DepartmentServiceImpl implements DepartmentService {
    private final DepartmentRepo departmentRepo;

    public DepartmentResponseDto saveDepartment(DepartmentRequestDto departmentDto) {
        Department department = Department.builder()
                .departmentName(departmentDto.getDepartmentName())
                .departDescription(departmentDto.getDepartDescription())
                .departmentCode(departmentDto.getDepartmentCode())
                .build();

        Department saveDepartment = departmentRepo.save(department);

        DepartmentResponseDto saveDepartmentDto = DepartmentResponseDto .builder()
                .id(saveDepartment.getId())
                .departmentName(saveDepartment.getDepartmentName())
                .departDescription(saveDepartment.getDepartDescription())
                .departmentCode(saveDepartment.getDepartmentCode())
                .build();

        return saveDepartmentDto;
    }

    @Override
    public DepartmentResponseDto getDepartmentByCode(String departmentCode) {
        Department department = departmentRepo.findByDepartmentCode(departmentCode);

        DepartmentResponseDto dto = DepartmentResponseDto.builder()
                .id(department.getId())
                .departmentName(department.getDepartmentName())
                .departDescription(department.getDepartDescription())
                .departmentCode(department.getDepartmentCode())
                .build();
        return dto;

    }
}
