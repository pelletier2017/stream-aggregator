package com.pell.streamaggregator.repository;

import com.pell.streamaggregator.entity.StreamingProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StreamingProviderRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<StreamingProvider> getStreamingProviders() {
        // TODO this table doesnt exist yet
        String query = "SELECT * FROM streamingProvider";
        return jdbcTemplate.query(query, BeanPropertyRowMapper.newInstance(StreamingProvider.class));
    }
}
