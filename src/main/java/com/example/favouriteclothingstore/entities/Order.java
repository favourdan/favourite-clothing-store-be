package com.example.favouriteclothingstore.entities;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
@Entity
@Table(name= "order-tbl")
public class Order extends BaseEntity {
    private Double deliveryFee;
    private BigDecimal GrandTotal;
    private Double discount;

}
