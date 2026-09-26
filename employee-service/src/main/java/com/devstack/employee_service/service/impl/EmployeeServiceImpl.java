package com.devstack.employee_service.service.impl;

import com.devstack.employee_service.dto.request.EmployeeRequestDto;
import com.devstack.employee_service.dto.response.ApiResponseDto;
import com.devstack.employee_service.dto.response.DepartmentResponseDto;
import com.devstack.employee_service.dto.response.EmployeeResponseDto;
import com.devstack.employee_service.entity.Employee;
import com.devstack.employee_service.repository.EmployeeRepo;
import com.devstack.employee_service.service.APIClient;
import com.devstack.employee_service.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepo employeeRepo;

//    @Autowired
//    private RestTemplate restTemplate;

//    @Autowired
//    private WebClient webClient;

    @Autowired
    private APIClient apiClient;

    @Override
    public EmployeeResponseDto saveEmployee(EmployeeRequestDto employeeRequestDto) {
        Employee employee = Employee.builder()
                .firstName(employeeRequestDto.getFirstName())
                .lastName(employeeRequestDto.getLastName())
                .email(employeeRequestDto.getEmail())
                .departmentCode(employeeRequestDto.getDepartmentCode())
                .build();

        Employee saveEmployeeDto = employeeRepo.save(employee);
        EmployeeResponseDto responseDto = EmployeeResponseDto.builder()
                .id(saveEmployeeDto.getId())
                .firstName(saveEmployeeDto.getFirstName())
                .lastName(saveEmployeeDto.getLastName())
                .email(saveEmployeeDto.getEmail())
                .departmentCode(saveEmployeeDto.getDepartmentCode())
                .build();

        return responseDto;
    }

    @Override
    public   ApiResponseDto  getEmployeeById(Long id) {
        Employee employee = employeeRepo.findById(id).get();

        //Commuinication with rest template
//       ResponseEntity<DepartmentResponseDto> responseEntity = restTemplate
//                .getForEntity("http://localhost:8081/api/v1/departments/" + employee.getDepartmentCode(),
//                        DepartmentResponseDto.class);
//
//        DepartmentResponseDto dto = responseEntity.getBody();

        //web client
//     DepartmentResponseDto dto = webClient.get()
//                .uri("http://localhost:8081/api/v1/departments/" + employee.getDepartmentCode())
//                .retrieve()
//                .bodyToMono(DepartmentResponseDto.class)
//                .block();

        //feign-client
        DepartmentResponseDto dto = apiClient.getDepartment(employee.getDepartmentCode());

        EmployeeResponseDto savedEmployeeDto = EmployeeResponseDto.builder()
                .id(employee.getId())
                .firstName(employee.getFirstName())
                .lastName(employee.getLastName())
                .email(employee.getEmail())
                .departmentCode(employee.getDepartmentCode())
                .build();

        ApiResponseDto apiResponseDto = new ApiResponseDto();
        apiResponseDto.setEmployeeDto(savedEmployeeDto);
        apiResponseDto.setDepartmentDto(dto);


        return apiResponseDto;
    }
}
