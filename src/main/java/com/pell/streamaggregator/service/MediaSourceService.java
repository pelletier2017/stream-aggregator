package com.pell.streamaggregator.service;

import com.pell.streamaggregator.entity.MediaSource;
import com.pell.streamaggregator.repository.MediaSourceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MediaSourceService {

    @Autowired
    private MediaSourceRepository mediaSourceRepository;

    public List<MediaSource> getAllMediaSources() {
        return mediaSourceRepository.getAllMediaSources();
    }

    public Optional<MediaSource> findMediaSourceById(int mediaPlatformId, int mediaId) {
        return mediaSourceRepository.findMediaSourceById(mediaPlatformId, mediaId);
    }
}
