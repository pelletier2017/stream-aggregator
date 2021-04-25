package com.pell.streamaggregator.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Media {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NonNull
    private String name;

    private int directorId;

//    @ManyToOne
//    @JoinColumn(name = "directorId")
//    private Director director;

    private int productionYear;

    private int runtimeMinutes;

    private String summaryUrl;
}
