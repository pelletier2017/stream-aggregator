package com.pell.streamaggregator.repository;

import com.pell.streamaggregator.entity.MediaSourceSubscription;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MediaSourceSubscriptionRepository extends BaseRepository {

    private static final String MEDIA_SOURCE_SUBSCRIPTION_TABLE = "MediaSourceSubscription";

    public MediaSourceSubscriptionRepository() {
        super(MEDIA_SOURCE_SUBSCRIPTION_TABLE);
    }

    public List<MediaSourceSubscription> getAllMediaSourceSubscriptions() {
        return selectAll(MediaSourceSubscription.class);
    }
}
