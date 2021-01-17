package com.pell.streamaggregator.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class MediaPlatform {
    private int streamingServiceId;
    private String name;
    private String url;
}
