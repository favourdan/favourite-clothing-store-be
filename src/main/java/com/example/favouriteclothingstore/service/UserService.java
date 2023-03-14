package com.example.favouriteclothingstore.service;

import com.example.favouriteclothingstore.dto.UserDto;
import com.example.favouriteclothingstore.entities.Person;
import org.springframework.http.ResponseEntity;

public interface UserService {
   ResponseEntity<Person> createUsers(UserDto userDto);
}
