package com.pell.streamaggregator.service.crud;

import com.pell.streamaggregator.entity.Media;
import com.pell.streamaggregator.repository.MediaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MediaService {

    @Autowired
    private MediaRepository mediaRepository;

    public Iterable<Media> getAll() {
        return mediaRepository.findAll();
    }

    public Optional<Media> getById(long id) {
        return mediaRepository.findById(id);
    }

    public Media add(Media media) {
        return mediaRepository.save(media);
    }

}
