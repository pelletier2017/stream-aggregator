package com.pell.streamaggregator.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@IdClass(MediaSourceId.class)
public class MediaSource  {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long mediaId;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long mediaPlatformId;

    private boolean isAvailable;

    private boolean isRentable;

    private boolean isBuyable;

    private BigDecimal rentPrice;

    private BigDecimal buyPrice;
}
