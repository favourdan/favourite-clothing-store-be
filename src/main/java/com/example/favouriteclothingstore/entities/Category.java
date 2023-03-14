package com.example.favouriteclothingstore.entities;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
@Entity
@Table(name= "category-tbl")
public class Category extends BaseEntity{

    private String name;
    private String imageUrl;
}
