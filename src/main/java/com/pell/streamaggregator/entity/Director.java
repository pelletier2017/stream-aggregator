package com.pell.streamaggregator.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;

import java.util.Date;

@AllArgsConstructor
@Getter
public class Director {
    private final int id;

    @NonNull
    private final String firstName;

    @NonNull
    private final String lastName;

    private final Date dateOfBirth;
}
