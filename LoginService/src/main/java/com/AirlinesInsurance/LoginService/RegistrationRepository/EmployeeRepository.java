package com.AirlinesInsurance.LoginService.RegistrationRepository;

import com.AirlinesInsurance.LoginService.RegistrationEntity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.Optional;

//Employee Table with integer as the primary key is extended.
@EnableJpaRepositories
@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

    Optional<Employee> findOneByEmailandPassword(String email,String password);
    Employee findbyEmail(String Email);
}
