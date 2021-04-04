package com.pell.streamaggregator.service.crud;

import com.pell.streamaggregator.entity.MediaPlatform;
import com.pell.streamaggregator.repository.MediaPlatformRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MediaPlatformService {

    @Autowired
    private MediaPlatformRepository repository;

    public Iterable<MediaPlatform> getAll() {
        return repository.findAll();
    }

    public Optional<MediaPlatform> getById(long id) {
        return repository.findById(id);
    }

    public MediaPlatform add(MediaPlatform mediaPlatform) {
        return repository.save(mediaPlatform);
    }

    public MediaPlatform put(MediaPlatform mediaPlatform, long id) {
        mediaPlatform.setId(id);
        return repository.save(mediaPlatform);
    }

}
