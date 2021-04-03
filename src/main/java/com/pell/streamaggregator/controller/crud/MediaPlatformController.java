package com.pell.streamaggregator.controller.crud;

import com.pell.streamaggregator.entity.Media;
import com.pell.streamaggregator.entity.MediaPlatform;
import com.pell.streamaggregator.service.crud.MediaPlatformService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api")
public class MediaPlatformController {

    @Autowired
    private MediaPlatformService service;

    @GetMapping("/media-platforms")
    public Iterable<MediaPlatform> getAll() {
        return service.getAll();
    }

    @GetMapping("/media-platforms/{id}")
    public Optional<MediaPlatform> getById(@PathVariable long id) {
        return service.getById(id);
    }

    @PostMapping("/media-platforms")
    public MediaPlatform add(@RequestBody MediaPlatform mediaPlatform) {
        return service.add(mediaPlatform);
    }

    @PutMapping("/media-platforms/{id}")
    public MediaPlatform put(@RequestBody MediaPlatform mediaPlatform, @PathVariable long id) {
        return service.put(mediaPlatform, id);
    }
}
