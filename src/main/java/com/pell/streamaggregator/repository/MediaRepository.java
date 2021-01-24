package com.pell.streamaggregator.repository;

import com.pell.streamaggregator.entity.Media;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MediaRepository extends BaseRepository {

    private static final String MEDIA_TABLE = "Media";

    public MediaRepository() {
        super(MEDIA_TABLE);
    }

    public List<Media> getAllMedia() {
        return selectAll(Media.class);
    }
}
