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
@Table(name= "product-tbl")
public class Product extends BaseEntity{
    private String productName;
    private Double price;
    private String imageUrl;
    private Integer availableQty;
    private String string;
}
