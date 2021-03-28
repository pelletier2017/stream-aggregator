package com.pell.streamaggregator.service.crud;

import com.pell.streamaggregator.entity.MediaPlatform;
import com.pell.streamaggregator.repository.MediaPlatformRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MediaPlatformService {

    @Autowired
    private MediaPlatformRepository mediaPlatformRepository;

    public Iterable<MediaPlatform> getAll() {
        return mediaPlatformRepository.findAll();
    }

    public Optional<MediaPlatform> getById(long id) {
        return mediaPlatformRepository.findById(id);
    }

    public MediaPlatform add(MediaPlatform mediaPlatform) {
        return mediaPlatformRepository.save(mediaPlatform);
    }

}
