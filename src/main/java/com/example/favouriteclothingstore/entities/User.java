package com.example.favouriteclothingstore.entities;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;

@Setter
@Getter
@Builder
@Entity
@Table(name = "user-tbl")
public class User {

}
