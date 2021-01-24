package com.pell.streamaggregator.controller;

import com.pell.streamaggregator.entity.MediaPlatform;
import com.pell.streamaggregator.service.MediaPlatformService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class MediaPlatformController {

    @Autowired
    private MediaPlatformService mediaPlatformService;

    @GetMapping("/media-platforms")
    public List<MediaPlatform> getAllMediaPlatforms() {
        return mediaPlatformService.getAllMediaPlatforms();
    }

    @GetMapping("/media-platforms/{id}")
    public Optional<MediaPlatform> findMediaPlatformById(@PathVariable int id) {
        return mediaPlatformService.findMediaPlatformById(id);
    }
}
