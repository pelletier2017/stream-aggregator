package com.pell.streamaggregator.repository;

import com.pell.streamaggregator.entity.MediaPlatform;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MediaPlatformRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<MediaPlatform> getMediaPlatforms() {
        // TODO this table doesnt exist yet
        String query = "SELECT * FROM mediaPlatform";
        return jdbcTemplate.query(query, BeanPropertyRowMapper.newInstance(MediaPlatform.class));
    }
}