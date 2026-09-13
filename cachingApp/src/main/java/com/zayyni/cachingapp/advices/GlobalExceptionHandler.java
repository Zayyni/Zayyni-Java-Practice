package com.zayyni.cachingapp.advices;

import com.zayyni.cachingapp.exceptions.ResourceNotFoundException;
import org.hibernate.StaleObjectStateException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<?> handleResourceNotFoundException(ResourceNotFoundException e) {
    return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(StaleObjectStateException.class)
    public ResponseEntity<?> handleStaleObjectState(StaleObjectStateException e) {
        return new ResponseEntity<>("Stale Data", HttpStatus.CONFLICT);
    }
}
