package com.pell.streamaggregator.service.crud;

import com.pell.streamaggregator.entity.Subscription;
import com.pell.streamaggregator.repository.SubscriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SubscriptionService {

    @Autowired
    private SubscriptionRepository subscriptionRepository;

    public Iterable<Subscription> getAll() {
        return subscriptionRepository.findAll();
    }

    public Optional<Subscription> getById(long id) {
        return subscriptionRepository.findById(id);
    }

    public Subscription add(Subscription subscription) {
        return subscriptionRepository.save(subscription);
    }

}
