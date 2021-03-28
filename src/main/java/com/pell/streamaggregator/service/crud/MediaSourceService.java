package com.pell.streamaggregator.service.crud;

import com.pell.streamaggregator.entity.MediaSource;
import com.pell.streamaggregator.repository.MediaSourceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MediaSourceService {

    @Autowired
    private MediaSourceRepository mediaSourceRepository;

    public Iterable<MediaSource> getAll() {
        return mediaSourceRepository.findAll();
    }

    public Optional<MediaSource> getById(long mediaPlatformId, long mediaId) {
        // TODO need to write custom JPA method to implement this query
        throw new IllegalStateException("not implemented");
    }

    public MediaSource add(MediaSource mediaSource) {
        return mediaSourceRepository.save(mediaSource);
    }

}
