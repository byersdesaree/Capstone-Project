package com.example.Capstone2.DAO;

import com.example.Capstone2.DTO.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    List<Employee> findByEmployeeName(String employeeName);
    List<Employee> findByCompanyTitle(String companyTitle);
}
