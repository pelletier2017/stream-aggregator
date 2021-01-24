package com.pell.streamaggregator.repository;

import com.pell.streamaggregator.entity.MediaPlatform;
import lombok.AllArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

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
}
