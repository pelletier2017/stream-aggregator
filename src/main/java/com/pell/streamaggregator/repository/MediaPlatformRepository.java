package com.pell.streamaggregator.repository;

import com.pell.streamaggregator.entity.MediaPlatform;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MediaPlatformRepository extends BaseRepository {

    private static final String MEDIA_PLATFORM_TABLE = "MediaPlatform";

    public MediaPlatformRepository() {
        super(MEDIA_PLATFORM_TABLE);
    }

    public List<MediaPlatform> getAllMediaPlatforms() {
        return selectAll(MediaPlatform.class);
    }
}
