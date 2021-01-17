package com.pell.streamaggregator.controller;

import com.pell.streamaggregator.entity.MediaPlatform;
import com.pell.streamaggregator.entity.MediaSourceSubscription;
import com.pell.streamaggregator.service.MediaSourceSubscriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MediaSourceSubscriptionController {

    @Autowired
    private MediaSourceSubscriptionService mediaSourceSubscriptionService;

    @GetMapping("/media-source-subscriptions")
    public List<MediaSourceSubscription> getAllMediaSourceSubscriptions() {
        return mediaSourceSubscriptionService.getAllMediaSourceSubscriptions();
    }
}