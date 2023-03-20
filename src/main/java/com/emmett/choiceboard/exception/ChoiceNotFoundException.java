package com.emmett.choiceboard.exception;

public class ChoiceNotFoundException extends RuntimeException{
    public ChoiceNotFoundException(String message) {
        super(message);
    }
}
