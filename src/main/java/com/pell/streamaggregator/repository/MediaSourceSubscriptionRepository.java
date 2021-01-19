package com.pell.streamaggregator.repository;

import com.pell.streamaggregator.entity.MediaSourceSubscription;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MediaSourceSubscriptionRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<MediaSourceSubscription> getAllMediaSourceSubscriptions() {
        // TODO this table doesnt exist yet
        String query = "SELECT * FROM mediaSourceSubscription";
        return jdbcTemplate.query(query, BeanPropertyRowMapper.newInstance(MediaSourceSubscription.class));
    }
}
