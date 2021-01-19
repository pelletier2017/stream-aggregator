package com.pell.streamaggregator.repository;

import com.pell.streamaggregator.entity.Subscription;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SubscriptionRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Subscription> getAllSubscriptions() {
        // TODO this table doesnt exist yet
        String query = "SELECT * FROM subscription";
        return jdbcTemplate.query(query, BeanPropertyRowMapper.newInstance(Subscription.class));
    }
}
