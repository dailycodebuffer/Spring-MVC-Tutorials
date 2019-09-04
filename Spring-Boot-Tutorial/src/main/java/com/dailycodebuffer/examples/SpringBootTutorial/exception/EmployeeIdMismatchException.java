package com.dailycodebuffer.examples.SpringBootTutorial.exception;

public class EmployeeIdMismatchException extends  RuntimeException {

    public EmployeeIdMismatchException(String message, Throwable cause)
    {
        super(message, cause);
    }

    public EmployeeIdMismatchException()
    {
        super();
    }
}
