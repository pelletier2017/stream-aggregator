package com.pell.streamaggregator.service;

import com.pell.streamaggregator.entity.MediaPlatform;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MediaPlatformService {

    public List<MediaPlatform> getAllMediaPlatforms() {
        // TODO stubbed
        return List.of(new MediaPlatform(1, "amazon", "www.amazon.com"));
    }

}
