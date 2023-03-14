package com.example.favouriteclothingstore.entities;


import com.example.favouriteclothingstore.enums.PaymentPurpose;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;
import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
@Entity
@Table(name= "transaction-tbl")
public class Transaction extends BaseEntity{

    private BigDecimal amount;
    private String reference;
    @Enumerated(EnumType.STRING)
    private PaymentPurpose paymentPurpose;
}
