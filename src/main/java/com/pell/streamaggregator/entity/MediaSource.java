package com.pell.streamaggregator.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.math.BigDecimal;

@AllArgsConstructor
@Getter
public class MediaSource {

    private final int mediaId;

    private final int mediaPlatformId;

    private final boolean isAvailable;

    private final boolean isRentable;

    private final boolean isBuyable;

    private final BigDecimal rentPrice;

    private final BigDecimal buyPrice;
}
