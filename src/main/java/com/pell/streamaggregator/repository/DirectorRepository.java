package com.pell.streamaggregator.repository;

import com.pell.streamaggregator.entity.Director;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class DirectorRepository extends BaseRepository {

    private static final String DIRECTOR_TABLE = "Director";

    public DirectorRepository() {
        super(DIRECTOR_TABLE);
    }

    public List<Director> getAllDirectors() {
        return selectAll(Director.class);
    }

    public Optional<Director> findDirectorById(int id) {
        return findById(Director.class, id);
    }
}
