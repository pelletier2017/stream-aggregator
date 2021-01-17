package com.pell.streamaggregator.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;

import java.math.BigDecimal;

@AllArgsConstructor
@Getter
public class Subscription {
    private int id;

    @NonNull
    private String name;

    private String url;

    private BigDecimal monthlyPrice;
}
