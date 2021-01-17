package com.pell.streamaggregator.service;

import com.pell.streamaggregator.entity.Director;
import com.pell.streamaggregator.repository.DirectorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DirectorService {

    @Autowired
    private DirectorRepository directorRepository;

    public List<Director> getAllDirectors() {
        return directorRepository.getAllDirectors();
    }

}
