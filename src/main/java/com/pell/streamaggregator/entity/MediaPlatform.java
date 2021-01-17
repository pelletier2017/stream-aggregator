package com.pell.streamaggregator.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;

@AllArgsConstructor
@Getter
public class MediaPlatform {
    private final int id;

    @NonNull
    private final String name;

    @NonNull
    private final String url;
}
