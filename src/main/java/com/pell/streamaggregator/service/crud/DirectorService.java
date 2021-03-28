package com.pell.streamaggregator.service.crud;

import com.pell.streamaggregator.entity.Director;
import com.pell.streamaggregator.repository.DirectorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DirectorService {

    @Autowired
    private DirectorRepository directorRepository;

    public Optional<Director> getById(long id) {
        return directorRepository.findById(id);
    }

    public Iterable<Director> findAll() {
        return directorRepository.findAll();
    }

    public Director add(Director director) {
        return directorRepository.save(director);
    }
}
