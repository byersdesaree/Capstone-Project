package com.example.Capstone2.Controller;

import com.example.Capstone2.DAO.EmployeeRepository;
import com.example.Capstone2.DTO.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeRepository employeeRepo;

    @RequestMapping(value = "/employees", method = RequestMethod.POST)
    public Employee createEmployee(@RequestBody Employee e) {
        employeeRepo.save(e);
        return e;
    }

    @RequestMapping(value = "/employees/{id}", method = RequestMethod.GET)
    public Employee getEmployeeById (@PathVariable Integer id){
        return employeeRepo.getOne(id);
    }

    @RequestMapping(value = "/employees",method = RequestMethod.GET)
    public List<Employee> getAllEmployees(){
        return employeeRepo.findAll();
    }

    @RequestMapping(value = "/employees/{id}",method = RequestMethod.PUT)
    public void updateEmployee(@RequestBody Employee e, @PathVariable Integer id) {
        employeeRepo.save(e);
    }

    @RequestMapping(value = "/employees/{id}",method = RequestMethod.DELETE)
    public void deleteEmployee(@PathVariable Integer id) {
        employeeRepo.deleteById(id);
    }

    @RequestMapping(value = "/employeeByName/{employeeName}", method = RequestMethod.GET)
    public List<Employee> getEmployeeByName (@PathVariable String employeeName) {
        return employeeRepo.findByEmployeeName(employeeName);
    }
    @RequestMapping(value = "/employeeByCompanyName/{companyName}", method = RequestMethod.GET)
    public List<Employee> getEmployeeByCompanyName (@PathVariable String companyName) {
        return employeeRepo.findByCompanyTitle(companyName);
    }

}

