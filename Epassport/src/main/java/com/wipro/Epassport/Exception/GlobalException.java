package com.wipro.Epassport.Exception;

import com.wipro.Epassport.Entity.ApiErrors;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
@RestControllerAdvice
public class GlobalException {
    @ExceptionHandler(UserAlreadyExistException.class)
    public ResponseEntity<Object> handleUserAlreadyExistException(UserAlreadyExistException exception)
    {
        String msg = exception.getMessage();
        List<String> details = new ArrayList<>();
        details.add("User Already Exists");
        HttpStatus status = HttpStatus.CONFLICT;
        ApiErrors errors = new ApiErrors(msg,details,status, LocalDateTime.now());
        return ResponseEntity.status(status).body(errors);
    }
}
