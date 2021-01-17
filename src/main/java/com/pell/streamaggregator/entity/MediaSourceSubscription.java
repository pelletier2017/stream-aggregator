package com.pell.streamaggregator.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class MediaSourceSubscription {
    private final int subscriptionId;

    private final int mediaId;

    private final int mediaPlatformId;
}
