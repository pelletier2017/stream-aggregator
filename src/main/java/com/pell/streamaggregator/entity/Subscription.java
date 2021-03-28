package com.pell.streamaggregator.entity;

import lombok.*;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Subscription {
    private int id;

    @NonNull
    private String name;

    private String url;

    private BigDecimal monthlyPrice;
}
