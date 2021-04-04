package com.pell.streamaggregator.service.crud;

import com.pell.streamaggregator.entity.Media;
import com.pell.streamaggregator.entity.MediaPlatform;
import com.pell.streamaggregator.repository.MediaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MediaService {

    @Autowired
    private MediaRepository repository;

    public Iterable<Media> getAll() {
        return repository.findAll();
    }

    public Optional<Media> getById(long id) {
        return repository.findById(id);
    }

    public Media add(Media media) {
        return repository.save(media);
    }

    public Media put(Media media, long id) {
        media.setId(id);
        return repository.save(media);
    }

}
