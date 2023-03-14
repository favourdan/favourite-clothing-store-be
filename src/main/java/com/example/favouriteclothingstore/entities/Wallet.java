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
@Table(name= "wallet-tbl")
public class Wallet extends BaseEntity{
    private BigDecimal accountBalance;
}
