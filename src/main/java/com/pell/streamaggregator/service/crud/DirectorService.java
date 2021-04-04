package com.pell.streamaggregator.service.crud;

import com.pell.streamaggregator.entity.Director;
import com.pell.streamaggregator.repository.DirectorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DirectorService {

    @Autowired
    private DirectorRepository repository;

    public Optional<Director> getById(long id) {
        return repository.findById(id);
    }

    public Iterable<Director> findAll() {
        return repository.findAll();
    }

    public Director add(Director director) {
        return repository.save(director);
    }

    public Director put(Director director, long id) {
        director.setId(id);
        return repository.save(director);
    }
}
