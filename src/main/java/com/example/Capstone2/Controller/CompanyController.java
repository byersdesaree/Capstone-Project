package com.example.Capstone2.Controller;

import com.example.Capstone2.DAO.CompanyRepository;
import com.example.Capstone2.DTO.Company;
import com.example.Capstone2.Service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CompanyController {
    @Autowired
    CompanyRepository companyRepo;
    @Autowired
    CompanyService companyService;

    @RequestMapping(value = "/companies", method = RequestMethod.POST)
    public Company createCompany(@RequestBody Company c) {
        companyRepo.save(c);
        return c;
    }

    @RequestMapping(value = "/companies/{employeeName}", method = RequestMethod.GET)
    public Company getCompaniesByEmployeeName (@PathVariable String employeeName) {
        return companyRepo.getOne(employeeName);
    }

    @RequestMapping(value = "/companies",method = RequestMethod.GET)
    public List<Company> getAllCompanies(){
        return companyRepo.findAll();
    }

    @RequestMapping(value = "/companies/{companyName}",method = RequestMethod.PUT)
    public void updateCompany(@RequestBody Company c, @PathVariable String companyName) {
        companyRepo.save(c);
    }

    @RequestMapping(value = "/companies/{companyName}",method = RequestMethod.DELETE)
    public void deleteCompany(@PathVariable String companyName) {
        companyRepo.deleteById(companyName);
    }
    @RequestMapping(value = "/companies/log", method = RequestMethod.GET)
    public List<CompanyService> getLog () {
        return companyService.printLog();
    }


}


