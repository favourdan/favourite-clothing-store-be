package com.example.favouriteclothingstore.entities;

import lombok.*;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class Amount {
    private BigDecimal amount;

}
