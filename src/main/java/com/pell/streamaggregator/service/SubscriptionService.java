package com.pell.streamaggregator.service;

import com.pell.streamaggregator.entity.MediaPlatform;
import com.pell.streamaggregator.entity.Subscription;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubscriptionService {

    public List<Subscription> getAllSubscriptions() {
        // TODO stubbed
        return List.of(new Subscription());
    }

}
