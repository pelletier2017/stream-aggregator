package com.pell.streamaggregator.service;

import com.pell.streamaggregator.entity.MediaPlatform;
import com.pell.streamaggregator.entity.MediaSourceSubscription;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MediaSourceSubscriptionService {

    public List<MediaSourceSubscription> getAllMediaSourceSubscriptions() {
        // TODO stubbed
        return List.of(new MediaSourceSubscription());
    }

}
