package com.AirlinesInsurance.LoginService.RegistrationEntity;

import jakarta.persistence.*;

@Entity
@Table(name ="employee")
public class Employee {

    //Generated Employee ID
    @Id        //ID is generated value for the employee_id column with auto generated value
    @Column(name="employee_id",length = 16)
    @GeneratedValue(strategy = GenerationType.AUTO)  // setting auto generation
    private int employeeId;

    //Employee First name
    @Column(name="employee_firstname",length = 255)
    private String employeeFirstName;

    // Employee Last name
    @Column(name="employee_lastname",length = 255)
    private String employeeLastName;

    // Phone number or Contact details
    @Column(name="contact",length = 10)
    private int contact;

    //Email ID information
    @Column(name="email",length = 255)
    private String email;

    //Password details
    @Column(name="password",length = 255)
    private String password;

    //Generated Constructor
    public Employee(int employeeId, String employeeFirstName, String employeeLastName, int contact, String email, String password) {
        this.employeeId = employeeId;
        this.employeeFirstName = employeeFirstName;
        this.employeeLastName = employeeLastName;
        this.contact = contact;
        this.email = email;
        this.password = password;
    }
    // None constructor

    public Employee() {
    }

    // Generated Getter and Setter values

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
