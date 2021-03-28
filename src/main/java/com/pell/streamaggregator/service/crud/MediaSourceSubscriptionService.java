package com.pell.streamaggregator.service.crud;

import com.pell.streamaggregator.entity.MediaSourceSubscription;
import com.pell.streamaggregator.repository.MediaSourceSubscriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MediaSourceSubscriptionService {

    @Autowired
    private MediaSourceSubscriptionRepository mediaSourceSubscriptionRepository;

    public Iterable<MediaSourceSubscription> getAll() {
        return mediaSourceSubscriptionRepository.findAll();
    }

    public Optional<MediaSourceSubscription> getById(long mediaPlatformId, long mediaId, long subscriptionId) {
        // TODO requires custom JPA method
        throw new IllegalStateException("Not implemented");
    }

    public MediaSourceSubscription add(MediaSourceSubscription mediaSourceSubscription) {
        return mediaSourceSubscriptionRepository.save(mediaSourceSubscription);
    }

}
