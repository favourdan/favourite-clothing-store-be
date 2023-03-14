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
@Table(name= "delivery-tbl")
public class DeliveryCenter extends BaseEntity {
    private String name;
    private String address;
    private String email;
    private String phoneNumber;
    private Double delivery;

}
