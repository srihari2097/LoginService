package com.AirlinesInsurance.LoginService.RegistrationDTO;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class EmployeeDTO {

    private int employeeId;
    private String employeeFirstName;
    private String employeeLastName;
    private int contact;
    private String password;
    private String email;

    //EmployeeDTO Constructor
    public EmployeeDTO(int employeeId, String employeeFirstName, String employeeLastName, int contact, String password, String email) {
        this.employeeId = employeeId;
        this.employeeFirstName = employeeFirstName;
        this.employeeLastName = employeeLastName;
        this.contact = contact;
        this.password = password;
        this.email = email;
    }



    //Empty Constructor
    public EmployeeDTO() {
    }

    //EmployeeDTO getter and setter methods
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeFirstName() {
        return employeeFirstName;
    }

    public void setEmployeeFirstName(String employeeFirstName) {
        this.employeeFirstName = employeeFirstName;
    }

    public String getEmployeeLastName() {
        return employeeLastName;
    }

    public void setEmployeeLastName(String employeeLastName) {
        this.employeeLastName = employeeLastName;
    }

    public int getContact() {
        return contact;
    }

    public void setContact(int contact) {
        this.contact = contact;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "EmployeeDTO{" +
                "employeeId=" + employeeId +
                ", employeeFirstName='" + employeeFirstName + '\'' +
                ", employeeLastName='" + employeeLastName + '\'' +
                ", contact=" + contact +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
