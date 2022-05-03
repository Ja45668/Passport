package com.wipro.Epassport.Exception;

public class UserAlreadyExistException extends RuntimeException{
    public UserAlreadyExistException(String message)
    {
        super(message);
    }
}
