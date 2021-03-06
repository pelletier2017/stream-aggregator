package com.pell.streamaggregator.controller.crud;

import com.pell.streamaggregator.entity.MediaSourceSubscription;
import com.pell.streamaggregator.service.crud.MediaSourceSubscriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api")
public class MediaSourceSubscriptionController {

    @Autowired
    private MediaSourceSubscriptionService service;

    @GetMapping("/media-source-subscriptions")
    public Iterable<MediaSourceSubscription> getAll() {
        return service.getAll();
    }

    @GetMapping("/media-source-subscriptions/{mediaPlatformId}/{mediaId}/{subscriptionId}")
    public Optional<MediaSourceSubscription> getById(@PathVariable long mediaPlatformId, @PathVariable long mediaId, @PathVariable long subscriptionId) {
        return service.getById(mediaPlatformId, mediaId, subscriptionId);
    }

    @PostMapping("/media-source-subscriptions")
    public MediaSourceSubscription add(@RequestBody MediaSourceSubscription mediaSourceSubscription) {
        return service.add(mediaSourceSubscription);
    }
}