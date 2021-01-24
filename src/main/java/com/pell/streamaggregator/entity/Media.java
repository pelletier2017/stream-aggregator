package com.pell.streamaggregator.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Media {
    private int id;

    @NonNull
    private String name;

    private int directorId;

    private int productionYear;

    private int runtimeMinutes;

    private String summaryUrl;
}
