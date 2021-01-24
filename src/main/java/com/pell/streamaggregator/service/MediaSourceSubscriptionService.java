package com.pell.streamaggregator.service;

import com.pell.streamaggregator.entity.MediaSourceSubscription;
import com.pell.streamaggregator.repository.MediaSourceSubscriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MediaSourceSubscriptionService {

    @Autowired
    private MediaSourceSubscriptionRepository mediaSourceSubscriptionRepository;

    public List<MediaSourceSubscription> getAllMediaSourceSubscriptions() {
        return mediaSourceSubscriptionRepository.getAllMediaSourceSubscriptions();
    }

    public Optional<MediaSourceSubscription> findMediaSourceSubscriptionById(int mediaPlatformId, int mediaId, int subscriptionId) {
        return mediaSourceSubscriptionRepository.findMediaSourceSubscriptionById(mediaPlatformId, mediaId, subscriptionId);
    }
}
