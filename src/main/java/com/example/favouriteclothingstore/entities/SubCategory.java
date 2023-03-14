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
@Table(name= "subCategory-tbl")
public class SubCategory extends BaseEntity{
    private String name;
    private String imageUrl;


}
