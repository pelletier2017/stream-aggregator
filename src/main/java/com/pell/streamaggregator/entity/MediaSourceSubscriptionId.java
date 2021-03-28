package com.pell.streamaggregator.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class MediaSourceSubscriptionId implements Serializable {

    private long subscriptionId;

    private long mediaId;

    private long mediaPlatformId;
}
