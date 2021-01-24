package com.pell.streamaggregator.repository;

import com.pell.streamaggregator.entity.Director;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DirectorRepository extends BaseRepository {

    private static final String DIRECTOR_TABLE = "Director";

    public DirectorRepository() {
        super(DIRECTOR_TABLE);
    }

    public List<Director> getAllDirectors() {
        return selectAll(Director.class);
    }
}
