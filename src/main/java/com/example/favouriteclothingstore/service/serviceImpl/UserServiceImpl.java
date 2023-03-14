package com.example.favouriteclothingstore.service.serviceImpl;

import com.example.favouriteclothingstore.dto.UserDto;
import com.example.favouriteclothingstore.entities.Person;
import com.example.favouriteclothingstore.repository.UserRepository;
import com.example.favouriteclothingstore.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;


    @Override
    public ResponseEntity<Person> createUsers(UserDto userDto) {
        Person person = Person.builder()
                        .firstName(userDto.getFirstName())
                        .lastName(userDto.getLastName())
                        .phoneNumber(userDto.getPhoneNumber())
                        .build();
        return new ResponseEntity<>(userRepository.save(person), HttpStatus.CREATED);
    }
    }


