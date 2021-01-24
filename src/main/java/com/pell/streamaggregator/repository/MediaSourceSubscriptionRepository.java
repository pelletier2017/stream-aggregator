package com.pell.streamaggregator.repository;

import com.pell.streamaggregator.entity.MediaSourceSubscription;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class MediaSourceSubscriptionRepository extends BaseRepository {

    private static final String MEDIA_SOURCE_SUBSCRIPTION_TABLE = "MediaSourceSubscription";

    public MediaSourceSubscriptionRepository() {
        super(MEDIA_SOURCE_SUBSCRIPTION_TABLE);
    }

    public List<MediaSourceSubscription> getAllMediaSourceSubscriptions() {
        return selectAll(MediaSourceSubscription.class);
    }

    public Optional<MediaSourceSubscription> findMediaSourceSubscriptionById(int mediaPlatformId, int mediaId, int subscriptionId) {
        // TODO update query to use all 3 IDs
//        String query = "SELECT * FROM " + fullyQualifiedTableName() + " WHERE ID=" + id;
//        List<MediaSourceSubscription> response = jdbcTemplate.query(query, BeanPropertyRowMapper.newInstance(MediaSourceSubscription.class));
        return Optional.empty();
    }
}
