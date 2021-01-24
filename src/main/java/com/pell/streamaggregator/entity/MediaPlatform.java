package com.pell.streamaggregator.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class MediaPlatform {
    private int id;

    @NonNull
    private String name;

    @NonNull
    private String url;
}
