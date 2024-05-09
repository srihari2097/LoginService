package com.AirlinesInsurance.LoginService.RegistrationController;

import com.AirlinesInsurance.LoginService.RegistrationDTO.EmployeeDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.AirlinesInsurance.LoginService.RegistrationService.EmployeeService;

@RestController
@CrossOrigin // To Connect the front end with the backend
@RequestMapping("api/v1/employee") //Request mapping of api for controller

public class EmployeeController {
    @Autowired
    private EmployeeService employeeSerivce;
    @PostMapping(path = "/save")
    public String saveEmployee(@RequestBody EmployeeDTO employeeDTO){
    String id = employeeSerivce.addemployee(employeeDTO);
    }
}