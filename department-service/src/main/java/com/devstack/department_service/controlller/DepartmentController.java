package com.devstack.department_service.controlller;

import com.devstack.department_service.dto.request.DepartmentRequestDto;
import com.devstack.department_service.dto.response.DepartmentResponseDto;
import com.devstack.department_service.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departments")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @PostMapping
    public ResponseEntity<DepartmentResponseDto> saveDepartment(@RequestBody DepartmentRequestDto departmentDto){
        DepartmentResponseDto savedDepartment = departmentService.saveDepartment(departmentDto);
        return new ResponseEntity<>( savedDepartment, HttpStatus.CREATED);
    }

    @GetMapping("/{departmentCode}")
    public ResponseEntity<DepartmentResponseDto> getDepartmentByCode(@PathVariable String departmentCode){
        DepartmentResponseDto department = departmentService.getDepartmentByCode(departmentCode);
        return new ResponseEntity<>(department, HttpStatus.OK);
    }

}
