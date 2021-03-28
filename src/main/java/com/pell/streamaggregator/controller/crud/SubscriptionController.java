package com.pell.streamaggregator.controller.crud;

import com.pell.streamaggregator.entity.Subscription;
import com.pell.streamaggregator.service.crud.SubscriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api")
public class SubscriptionController {

    @Autowired
    private SubscriptionService subscriptionService;

    @GetMapping("/subscriptions")
    public Iterable<Subscription> getAll() {
        return subscriptionService.getAll();
    }

    @GetMapping("/subscriptions/{id}")
    public Optional<Subscription> getById(@PathVariable long id) {
        return subscriptionService.getById(id);
    }

    @PostMapping("/subscriptions")
    public Subscription add(@RequestBody Subscription subscription) {
        return subscriptionService.add(subscription);
    }
}