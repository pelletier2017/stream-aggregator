package com.pell.streamaggregator.repository;

import com.pell.streamaggregator.entity.MediaSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MediaSourceRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<MediaSource> getAllMediaSources() {
        // TODO this table doesnt exist yet
        String query = "SELECT * FROM mediaSource";
        return jdbcTemplate.query(query, BeanPropertyRowMapper.newInstance(MediaSource.class));
    }
}
