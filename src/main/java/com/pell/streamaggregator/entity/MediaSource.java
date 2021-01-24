package com.pell.streamaggregator.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class MediaSource {

    private int mediaId;

    private int mediaPlatformId;

    private boolean isAvailable;

    private boolean isRentable;

    private boolean isBuyable;

    private BigDecimal rentPrice;

    private BigDecimal buyPrice;
}
