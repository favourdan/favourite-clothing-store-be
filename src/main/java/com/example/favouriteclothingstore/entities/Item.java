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
@Table(name= "item-tbl")
public class Item extends BaseEntity {
    private String productName;
    private String imageUrl;
    private Integer orderQuantity;
    private Double unitPrice;
    private BigDecimal subTotal;

}
