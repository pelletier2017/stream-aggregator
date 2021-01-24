package com.pell.streamaggregator.repository;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
public class BaseRepository {
    protected static final String DATABASE_SCHEMA_PREFIX = "StreamAggregator.dbo";

    @NonNull
    private String tableName;

    @Autowired
    protected JdbcTemplate jdbcTemplate;

    protected String fullyQualifiedTableName() {
        return DATABASE_SCHEMA_PREFIX + "." + tableName;
    }

    protected <T> List<T> selectAll(Class<T> clazz) {
        String query = "SELECT * FROM " + fullyQualifiedTableName();
        return jdbcTemplate.query(query, BeanPropertyRowMapper.newInstance(clazz));
    }

    protected <T> Optional<T> findById(Class<T> clazz, int id) {
        String query = "SELECT * FROM " + fullyQualifiedTableName() + " WHERE ID=" + id;
        List<T> response = jdbcTemplate.query(query, BeanPropertyRowMapper.newInstance(clazz));

        if (response.size() == 0) {
            return Optional.empty();
        } else if (response.size() == 1) {
            return Optional.of(response.get(0));
        } else {
            throw new IllegalStateException("Should not be able to return multiple values for a single ID");
        }
    }
}
