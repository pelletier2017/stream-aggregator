package com.pell.streamaggregator.controller;

import com.pell.streamaggregator.entity.MediaSourceSubscription;
import com.pell.streamaggregator.service.MediaSourceSubscriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class MediaSourceSubscriptionController {

    @Autowired
    private MediaSourceSubscriptionService mediaSourceSubscriptionService;

    @GetMapping("/media-source-subscriptions")
    public List<MediaSourceSubscription> getAllMediaSourceSubscriptions() {
        return mediaSourceSubscriptionService.getAllMediaSourceSubscriptions();
    }

    @GetMapping("/media-source-subscriptions/{mediaPlatformId}/{mediaId}/{subscriptionId}")
    public Optional<MediaSourceSubscription> findMediaSourceSubscriptionById(@PathVariable int mediaPlatformId, @PathVariable int mediaId, @PathVariable int subscriptionId) {
        return mediaSourceSubscriptionService.findMediaSourceSubscriptionById(mediaPlatformId, mediaId, subscriptionId);
    }
}