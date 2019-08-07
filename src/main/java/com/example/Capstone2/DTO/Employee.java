package com.example.Capstone2.DTO;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name = "Employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer employeeId;
    @NotEmpty
    private String employeeName;
    private String companyTitle;
    @NotNull
    private double startTime;
    @NotNull
    private double endTime;
    @NotNull
    private boolean isPromoted;
    @NotNull
    private boolean hasAccess;
    private boolean entry;

    public Employee() {

    }

    public Employee(Integer employeeId, String employeeName, String companyTitle, double startTime, double endTime){
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.companyTitle = companyTitle;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "CompanyId")
    private Company company;

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getCompanyTitle() {
        return companyTitle;
    }

    public void setCompanyTitle(String companyTitle) {
        this.companyTitle = companyTitle;
    }

    public double getStartTime() {
        return startTime;
    }

    public void setStartTime(double startTime) {
        this.startTime = startTime;
    }

    public double getEndTime() {
        return endTime;
    }

    public void setEndTime(double endTime) {
        this.endTime = endTime;
    }

    public boolean getIsPromoted() {
        return isPromoted;
    }

    public void setIsPromoted(boolean promoted) {
        isPromoted = promoted;
    }

    public boolean getHasAccess() {
        return hasAccess;
    }

    public void setHasAccess(boolean hasAccess) {
        this.hasAccess = hasAccess;
    }

    public boolean getEntry() {
        return entry;
    }

    public void setEntry(boolean entry) {
        this.entry = entry;
    }
}
