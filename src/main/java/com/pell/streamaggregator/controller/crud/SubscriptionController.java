package com.pell.streamaggregator.controller.crud;

import com.pell.streamaggregator.entity.MediaPlatform;
import com.pell.streamaggregator.entity.Subscription;
import com.pell.streamaggregator.service.crud.SubscriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api")
public class SubscriptionController {

    @Autowired
    private SubscriptionService service;

    @GetMapping("/subscriptions")
    public Iterable<Subscription> getAll() {
        return service.getAll();
    }

    @GetMapping("/subscriptions/{id}")
    public Optional<Subscription> getById(@PathVariable long id) {
        return service.getById(id);
    }

    @PostMapping("/subscriptions")
    public Subscription add(@RequestBody Subscription subscription) {
        return service.add(subscription);
    }

    @PutMapping("/subscriptions/{id}")
    public Subscription put(@RequestBody Subscription subscription, @PathVariable long id) {
        return service.put(subscription, id);
    }
}