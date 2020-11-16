package com.dailycodebuffer.spring.function;

public class Employee {

    private String empId;
    private String empname;
    private String email;

    public Employee() {
    }

    public Employee(String empId, String empname, String email) {
        this.empId = empId;
        this.empname = empname;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId='" + empId + '\'' +
                ", empname='" + empname + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
