package com.pell.streamaggregator.service.crud;

import com.pell.streamaggregator.entity.Media;
import com.pell.streamaggregator.entity.Subscription;
import com.pell.streamaggregator.repository.SubscriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SubscriptionService {

    @Autowired
    private SubscriptionRepository repository;

    public Iterable<Subscription> getAll() {
        return repository.findAll();
    }

    public Optional<Subscription> getById(long id) {
        return repository.findById(id);
    }

    public Subscription add(Subscription subscription) {
        return repository.save(subscription);
    }

    public Subscription put(Subscription subscription, long id) {
        subscription.setId(id);
        return repository.save(subscription);
    }

}
