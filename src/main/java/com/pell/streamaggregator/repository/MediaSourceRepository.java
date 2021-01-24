package com.pell.streamaggregator.repository;

import com.pell.streamaggregator.entity.MediaSource;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MediaSourceRepository extends BaseRepository {

    private static final String MEDIA_SOURCE_TABLE = "MediaSource";

    public MediaSourceRepository() {
        super(MEDIA_SOURCE_TABLE);
    }

    public List<MediaSource> getAllMediaSources() {
        return selectAll(MediaSource.class);
    }
}
