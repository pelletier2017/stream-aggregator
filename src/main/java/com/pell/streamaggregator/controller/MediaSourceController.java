package com.pell.streamaggregator.controller;

import com.pell.streamaggregator.entity.MediaSource;
import com.pell.streamaggregator.service.MediaSourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class MediaSourceController {

    @Autowired
    private MediaSourceService mediaSourceService;

    @GetMapping("/media-sources")
    public List<MediaSource> getAllMediaSources() {
        return mediaSourceService.getAllMediaSources();
    }

    @GetMapping("/media-sources/{mediaPlatformId}/{mediaId}")
    public Optional<MediaSource> findMediaSourceById(@PathVariable int mediaPlatformId, @PathVariable int mediaId) {
        return mediaSourceService.findMediaSourceById(mediaPlatformId, mediaId);
    }
}