package com.example.Capstone2.Service;

import com.example.Capstone2.DAO.SixthFloorRepository;
import com.example.Capstone2.DTO.Employee;
import com.example.Capstone2.DTO.SixthFloor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SixthFloorService {
    @Autowired
    SixthFloorRepository sixthFloorRepo;
    @Autowired
    EmployeeService employee;


    public void setAccess(Employee e, SixthFloor sxFloor){
        String company = employee.setCompanyTitle(e);
        if(company.equals("6")){
            if (e.getHasAccess()== true){
                sxFloor.setServerRoom(true);
            }else{
                sxFloor.setGeneralWorkingrea(true);
            }
            if (e.getIsPromoted()== true);
            sxFloor.setConferenceRoom(true);
        }else{
            sxFloor.setGeneralWorkingrea(true);
        }
    }
}
