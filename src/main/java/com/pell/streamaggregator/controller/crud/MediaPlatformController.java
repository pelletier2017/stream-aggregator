package com.pell.streamaggregator.controller.crud;

import com.pell.streamaggregator.entity.MediaPlatform;
import com.pell.streamaggregator.service.crud.MediaPlatformService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api")
public class MediaPlatformController {

    @Autowired
    private MediaPlatformService mediaPlatformService;

    @GetMapping("/media-platforms")
    public Iterable<MediaPlatform> getAll() {
        return mediaPlatformService.getAll();
    }

    @GetMapping("/media-platforms/{id}")
    public Optional<MediaPlatform> getById(@PathVariable long id) {
        return mediaPlatformService.getById(id);
    }

    @PostMapping("/media-platforms")
    public MediaPlatform add(@RequestBody MediaPlatform mediaPlatform) {
        return mediaPlatformService.add(mediaPlatform);
    }
}
