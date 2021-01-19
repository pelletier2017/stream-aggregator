package com.pell.streamaggregator.repository;

import com.pell.streamaggregator.entity.Media;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MediaRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Media> getAllMedia() {
        // TODO this table doesnt exist yet
        String query = "SELECT * FROM media";
        return jdbcTemplate.query(query, BeanPropertyRowMapper.newInstance(Media.class));
    }
}
