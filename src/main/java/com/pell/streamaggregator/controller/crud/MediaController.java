package com.pell.streamaggregator.controller.crud;

import com.pell.streamaggregator.entity.Director;
import com.pell.streamaggregator.entity.Media;
import com.pell.streamaggregator.service.crud.MediaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api")
public class MediaController {

    @Autowired
    private MediaService service;

    @GetMapping("/media")
    public Iterable<Media> getAll() {
        return service.getAll();
    }

    @GetMapping("/media/{id}")
    public Optional<Media> getById(@PathVariable long id) {
        return service.getById(id);
    }

    @PostMapping("/media")
    public Media add(@RequestBody Media media) {
        return service.add(media);
    }

    @PutMapping("/media/{id}")
    public Media put(@RequestBody Media media, @PathVariable long id) {
        return service.put(media, id);
    }
}