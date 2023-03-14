package com.example.favouriteclothingstore.entities;


import com.example.favouriteclothingstore.enums.Gender;
import lombok.*;
import lombok.extern.slf4j.Slf4j;

import javax.management.relation.Role;
import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "person_tbl")
public class Person extends BaseEntity {

    @Column(nullable = false, length = 20)
    private String firstName;

    @Column(nullable = false, length = 10)
    private String lastName;

    @Column(nullable = false, length = 20)
    private String phoneNumber;

    @Column(nullable = false, length = 20)
    private String email;

    private Gender gender;

    @Column(nullable = false, length = 20)
    private String password;

    @Enumerated(EnumType.STRING)
    private Role role;




}
