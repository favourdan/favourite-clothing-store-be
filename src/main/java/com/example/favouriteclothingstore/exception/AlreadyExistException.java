package com.example.favouriteclothingstore.exception;

import org.springframework.data.jpa.repository.JpaRepository;

public class AlreadyExistException extends RuntimeException {
    public AlreadyExistException(String message) {
        super(message);
    }
}
