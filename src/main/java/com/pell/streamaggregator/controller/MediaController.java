package com.pell.streamaggregator.controller;

import com.pell.streamaggregator.entity.Media;
import com.pell.streamaggregator.service.MediaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MediaController {

    @Autowired
    private MediaService mediaService;

    @GetMapping("/media")
    public List<Media> getAllMedia() {
        return mediaService.getAllMedia();
    }
}