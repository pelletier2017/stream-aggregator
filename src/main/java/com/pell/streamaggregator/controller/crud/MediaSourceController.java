package com.pell.streamaggregator.controller.crud;

import com.pell.streamaggregator.entity.MediaSource;
import com.pell.streamaggregator.service.crud.MediaSourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api")
public class MediaSourceController {

    @Autowired
    private MediaSourceService mediaSourceService;

    @GetMapping("/media-sources")
    public Iterable<MediaSource> getAll() {
        return mediaSourceService.getAll();
    }

    @GetMapping("/media-sources/{mediaPlatformId}/{mediaId}")
    public Optional<MediaSource> getById(@PathVariable long mediaPlatformId, @PathVariable long mediaId) {
        return mediaSourceService.getById(mediaPlatformId, mediaId);
    }

    @PostMapping("/media-sources")
    public MediaSource add(@RequestBody MediaSource mediaSource) {
        return mediaSourceService.add(mediaSource);
    }
}