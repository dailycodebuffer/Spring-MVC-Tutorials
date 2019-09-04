package com.dailycodebuffer.examples.SpringBootTutorial.exception;

public class EmployeeNotFoundException extends  RuntimeException {

    public EmployeeNotFoundException(String message, Throwable cause)
    {
        super(message,cause);
    }

    public EmployeeNotFoundException()
    {
        super();
    }
    
}
