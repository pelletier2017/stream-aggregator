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
    private long subscriptionId;

    @Id
    private long mediaId;

    @Id
    private long mediaPlatformId;
}
