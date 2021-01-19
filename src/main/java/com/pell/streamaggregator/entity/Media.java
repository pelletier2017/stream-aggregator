package com.pell.streamaggregator.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;

@AllArgsConstructor
@Getter
public class Media {
    private final int id;

    @NonNull
    private final String name;

    private final int directorId;

    private final int productionYear;

    private final int runtimeMinutes;

    private final String summaryUrl;
}
