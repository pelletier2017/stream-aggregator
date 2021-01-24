package com.pell.streamaggregator.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Director {
    private int id;

    @NonNull
    private String firstName;

    @NonNull
    private String lastName;

    private Date dateOfBirth;
}
