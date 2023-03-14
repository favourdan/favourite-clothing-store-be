package com.example.favouriteclothingstore.controller;


import com.example.favouriteclothingstore.dto.UserDto;
import com.example.favouriteclothingstore.entities.Person;
import com.example.favouriteclothingstore.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/user")
public class UserController {
    private final UserService userService;
    @PostMapping("/add")
    public ResponseEntity<Person>createUsers(@RequestBody UserDto userDto){
       return userService.createUsers(userDto);
    }

    @GetMapping("/sayHello")
    public String sayHello(){
        return "helloMyG";
    }

}
