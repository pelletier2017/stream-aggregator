package com.pell.streamaggregator.service;

import com.pell.streamaggregator.entity.MediaPlatform;
import com.pell.streamaggregator.repository.MediaPlatformRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MediaPlatformService {

    @Autowired
    private MediaPlatformRepository mediaPlatformRepository;

    public List<MediaPlatform> getAllMediaPlatforms() {
        return mediaPlatformRepository.getAllMediaPlatforms();
    }

    public Optional<MediaPlatform> findMediaPlatformById(int id) {
        return mediaPlatformRepository.findMediaPlatformById(id);
    }
}
