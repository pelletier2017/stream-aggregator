package com.pell.streamaggregator.service;

import com.pell.streamaggregator.entity.Media;
import com.pell.streamaggregator.repository.MediaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MediaService {

    @Autowired
    private MediaRepository mediaRepository;

    public List<Media> getAllMedia() {
        return mediaRepository.getAllMedia();
    }

}