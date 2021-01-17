package com.pell.streamaggregator.controller;

import com.pell.streamaggregator.entity.MediaSource;
import com.pell.streamaggregator.service.MediaSourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MediaSourceController {

    @Autowired
    private MediaSourceService mediaSourceService;

    @GetMapping("/media-sources")
    public List<MediaSource> getAllStreamingProviders() {
        return mediaSourceService.getAllMediaSources();
    }
}