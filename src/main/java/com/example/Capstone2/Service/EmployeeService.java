package com.example.Capstone2.Service;

import com.example.Capstone2.DAO.EmployeeRepository;
import com.example.Capstone2.DTO.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class EmployeeService {
    @Autowired
    EmployeeRepository employeerepo;

    public Employee addEmployee(Employee e){
        employeerepo.save(e);
        return e;
    }

    public void deleteEmployee(Employee a){
        employeerepo.delete(a);
    }

    public void promotion(Employee b){
        boolean promoted = b.getIsPromoted();
        if(promoted == true){
            b.setHasAccess(true);
        }
    }

    public void demotion(Employee c){
        boolean demoted = c.getIsPromoted();
        if(demoted == false){
            c.setHasAccess(false);
        }
    }

    public String setCompanyTitle(Employee name){
        String[] namearr= {"1","2","3","4","5","6","7","8"};
        Random random = new Random();

        int select = random.nextInt(namearr.length);
        name.setCompanyTitle(namearr[select]);

        return namearr[select];
    }

    public void entry(Employee d){
        if(d.getEntry() == true){
            d.setEntry(true);
        }
    }
}
