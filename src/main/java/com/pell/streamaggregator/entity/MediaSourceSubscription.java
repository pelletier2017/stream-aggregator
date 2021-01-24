package com.pell.streamaggregator.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class MediaSourceSubscription {
    private int subscriptionId;

    private int mediaId;

    private int mediaPlatformId;
}
