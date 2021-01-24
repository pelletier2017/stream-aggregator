package com.pell.streamaggregator.repository;

import com.pell.streamaggregator.entity.Subscription;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SubscriptionRepository extends BaseRepository {

    private static final String SUBSCRIPTION_TABLE = "Subscription";

    public SubscriptionRepository() {
        super(SUBSCRIPTION_TABLE);
    }

    public List<Subscription> getAllSubscriptions() {
        return selectAll(Subscription.class);
    }
}
