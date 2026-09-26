package com.devstack.employee_service.controller;

import com.devstack.employee_service.dto.request.EmployeeRequestDto;
import com.devstack.employee_service.dto.response.ApiResponseDto;
import com.devstack.employee_service.dto.response.EmployeeResponseDto;
import com.devstack.employee_service.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping
    public ResponseEntity<EmployeeResponseDto> saveEmployee(@RequestBody EmployeeRequestDto employeeRequestDto){
        EmployeeResponseDto dto = employeeService.saveEmployee(employeeRequestDto);
        return new ResponseEntity<>(dto,HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<ApiResponseDto> getEmployee(@PathVariable Long id){
        ApiResponseDto  dto = employeeService.getEmployeeById(id);
        return new ResponseEntity<>(dto,HttpStatus.OK);
    }
}
