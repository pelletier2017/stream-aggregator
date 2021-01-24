package com.pell.streamaggregator.controller;

import com.pell.streamaggregator.entity.Subscription;
import com.pell.streamaggregator.service.SubscriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class SubscriptionController {

    @Autowired
    private SubscriptionService subscriptionService;

    @GetMapping("/subscriptions")
    public List<Subscription> getAllSubscriptions() {
        return subscriptionService.getAllSubscriptions();
    }

    @GetMapping("/subscriptions/{id}")
    public Optional<Subscription> findSubscriptionById(@PathVariable int id) {
        return subscriptionService.findSubscriptionById(id);
    }
}