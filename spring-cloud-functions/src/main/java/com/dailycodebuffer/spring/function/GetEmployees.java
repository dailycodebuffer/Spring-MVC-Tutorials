package com.dailycodebuffer.spring.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class GetEmployees implements Supplier<EmployeeData> {


    @Override
    public EmployeeData get() {
        EmployeeData employeeData
                = new EmployeeData();
        employeeData.setEmployees(this.employees());

        return employeeData;
    }


    //Consider getting Data form Database
    private List<Employee> employees() {
        return new ArrayList() {{
            add(new Employee("1","Shabbir","shabbir@gmail.com"));
            add(new Employee("2","Nikhil","nikhil@gmail.com"));
            add(new Employee("3","Shivam","shivam@gmail.com"));
            add(new Employee("4","Shankhadeep","Shankhadeep@gmail.com"));
        }};

    }
}
