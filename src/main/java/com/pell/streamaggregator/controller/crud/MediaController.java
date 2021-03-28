package com.pell.streamaggregator.controller.crud;

import com.pell.streamaggregator.entity.Media;
import com.pell.streamaggregator.service.crud.MediaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api")
public class MediaController {

    @Autowired
    private MediaService mediaService;

    @GetMapping("/media")
    public Iterable<Media> getAll() {
        return mediaService.getAll();
    }

    @GetMapping("/media/{id}")
    public Optional<Media> getById(@PathVariable long id) {
        return mediaService.getById(id);
    }

    @PostMapping("/media")
    public Media add(@RequestBody Media media) {
        return mediaService.add(media);
    }
}