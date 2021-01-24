package com.pell.streamaggregator.service;

import com.pell.streamaggregator.entity.Subscription;
import com.pell.streamaggregator.repository.SubscriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SubscriptionService {

    @Autowired
    private SubscriptionRepository subscriptionRepository;

    public List<Subscription> getAllSubscriptions() {
        return subscriptionRepository.getAllSubscriptions();
    }

    public Optional<Subscription> findSubscriptionById(int id) {
        return subscriptionRepository.findSubscriptionById(id);
    }
}
