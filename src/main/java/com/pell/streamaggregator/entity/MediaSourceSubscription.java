package com.pell.streamaggregator.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@IdClass(MediaSourceSubscriptionId.class)
public class MediaSourceSubscription implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long subscriptionId;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long mediaId;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long mediaPlatformId;
}
