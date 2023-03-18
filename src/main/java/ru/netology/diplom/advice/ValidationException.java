package ru.netology.diplom.advice;

public class ValidationException extends RuntimeException {
    public ValidationException(String message) {
        super(message);
    }
}