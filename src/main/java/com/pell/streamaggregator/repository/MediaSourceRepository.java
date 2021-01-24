package com.pell.streamaggregator.repository;

import com.pell.streamaggregator.entity.MediaSource;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class MediaSourceRepository extends BaseRepository {

    private static final String MEDIA_SOURCE_TABLE = "MediaSource";

    public MediaSourceRepository() {
        super(MEDIA_SOURCE_TABLE);
    }

    public List<MediaSource> getAllMediaSources() {
        return selectAll(MediaSource.class);
    }

    public Optional<MediaSource> findMediaSourceById(int mediaPlatformId, int mediaId) {
        // TODO update query to use both ids
//        String query = "SELECT * FROM " + fullyQualifiedTableName() + " WHERE ID=" + id;
//        List<MediaSource> response = jdbcTemplate.query(query, BeanPropertyRowMapper.newInstance(MediaSource.class));
        return Optional.empty();
    }
}
