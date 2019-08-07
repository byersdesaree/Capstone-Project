package com.example.Capstone2.Service;

import com.example.Capstone2.DTO.Company;
import com.example.Capstone2.DTO.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CompanyService {
    @Autowired
    EmployeeService employeeService;

    List<CompanyService> employeeLog = new ArrayList<>();

    public List<Company> getAllCompanies() {
        List<Company> companyList = new ArrayList<>();

        for (int i = 0; i < companyList.size(); i++) {
        }
        return companyList;
    }

    public void printEmployees(Employee e) {
        String employeeCompany = employeeService.setCompanyTitle(e);
        List<Employee> employeeList = new ArrayList<>();

        for (Employee companyTitle : employeeList) {
            if (employeeCompany.equalsIgnoreCase("1")) {
                System.out.println(companyTitle);
            } else {
            if (employeeCompany.equalsIgnoreCase("2")) {
                System.out.println(companyTitle);
            } else {
            if (employeeCompany.equalsIgnoreCase("2")) {
                System.out.println(companyTitle);
            } else {
            if (employeeCompany.equalsIgnoreCase("3")) {
                System.out.println(companyTitle);
            } else {
            if (employeeCompany.equalsIgnoreCase("4")) {
                System.out.println(companyTitle);
            } else {
            if (employeeCompany.equalsIgnoreCase("5")) {
                System.out.println(companyTitle);
            } else {
            if (employeeCompany.equalsIgnoreCase("6")) {
                System.out.println(companyTitle);
            } else {
            if (employeeCompany.equalsIgnoreCase("7") || employeeCompany.equalsIgnoreCase("8")) {
                System.out.println(companyTitle);
            }

                    }
                    }
                    }
                    }
                    }
                    }
                    }
        }
    }

    public void createLog(){
        Employee e1 = new Employee(1,"Susan Brown", "3", 5.30,6.30);
        Employee e2 = new Employee(1,"Susan Brown", "3", 5.30,6.30);
        Employee e3 = new Employee(1,"Susan Brown", "3", 5.30,6.30);
        Employee e4 = new Employee(1,"Susan Brown", "3", 5.30,6.30);
        Employee e5 = new Employee(1,"Susan Brown", "3", 5.30,6.30);
        Employee e6 = new Employee(1,"Susan Brown", "3", 5.30,6.30);
        Employee e7 = new Employee(1,"Susan Brown", "3", 5.30,6.30);
        Employee e8 = new Employee(1,"Susan Brown", "3", 5.30,6.30);
        Employee e9 = new Employee(1,"Susan Brown", "3", 5.30,6.30);
        Employee e10 = new Employee(1,"Susan Brown", "3", 5.30,6.30);
        Employee e11= new Employee(1,"Susan Brown", "3", 5.30,6.30);

        List<Employee> employeeLog = new ArrayList<>();

        for (Employee log: employeeLog){
            if(log.getEntry()==true){
                employeeLog.add(e1);
            }
            if(log.getEntry()==true){
                employeeLog.add(e2);
            }
            if(log.getEntry()==true){
                employeeLog.add(e3);
            }
            if(log.getEntry()==true){
                employeeLog.add(e4);
            }
            if(log.getEntry()==true){
                employeeLog.add(e5);
            }
            if(log.getEntry()==true){
                employeeLog.add(e6);
            }
            if(log.getEntry()==true){
                employeeLog.add(e7);
            }
            if(log.getEntry()==true){
                employeeLog.add(e8);
            }
            if(log.getEntry()==true){
                employeeLog.add(e9);
            }
            if(log.getEntry()==true){
                employeeLog.add(e10);
            }
            if(log.getEntry()==true){
                employeeLog.add(e11);
            }
        }
    }

    public List<CompanyService> printLog(){
        System.out.println(employeeLog);
        return employeeLog;
    }
}
