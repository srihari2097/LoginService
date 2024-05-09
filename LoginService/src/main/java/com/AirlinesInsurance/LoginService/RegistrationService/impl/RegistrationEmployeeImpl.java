package com.AirlinesInsurance.LoginService.RegistrationService.impl;

import com.AirlinesInsurance.LoginService.RegistrationDTO.EmployeeDTO;
import com.AirlinesInsurance.LoginService.RegistrationEntity.Employee;
import com.AirlinesInsurance.LoginService.RegistrationRepository.EmployeeRepository;
import com.AirlinesInsurance.LoginService.RegistrationService.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;

public class RegistrationEmployeeImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;
    @Override
    public String addemployee(EmployeeDTO employeeDTO) {
        Employee employee = new Employee(

        employeeDTO.getEmployeeId(),
        employeeDTO.getEmployeeFirstName(),
        employeeDTO.getEmployeeLastName(),
        employeeDTO.getEmail(),
        this.passwordEncoder.encode(employeeDTO.getPassword()));

        employeeRepository.save(employee);
        return employee.getEmployeeFirstName().concat(employee.getEmployeeLastName());
    }
}
