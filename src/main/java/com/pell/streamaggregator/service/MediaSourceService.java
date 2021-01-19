package com.pell.streamaggregator.service;

import com.pell.streamaggregator.entity.MediaSource;
import com.pell.streamaggregator.repository.MediaSourceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MediaSourceService {

    @Autowired
    private MediaSourceRepository mediaSourceRepository;

    public List<MediaSource> getAllMediaSources() {
        return mediaSourceRepository.getAllMediaSources();
    }

}
