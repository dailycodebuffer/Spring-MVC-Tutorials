package com.dailycodebuffer.examples.SpringBootTutorial.exception;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class CustomExceptioHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler({EmployeeNotFoundException.class})
    protected ResponseEntity<Object> handleNotFoundException(Exception ex, WebRequest request)
    {
        return handleExceptionInternal(ex, "Employee NOt Found ",new HttpHeaders(), HttpStatus.NOT_FOUND, request);
    }

    @ExceptionHandler({EmployeeIdMismatchException.class})
    protected ResponseEntity<Object> handleBadRequestException(Exception ex, WebRequest request)
    {
        return handleExceptionInternal(ex, ex.getLocalizedMessage(),new HttpHeaders(), HttpStatus.NOT_FOUND, request);
    }
}
