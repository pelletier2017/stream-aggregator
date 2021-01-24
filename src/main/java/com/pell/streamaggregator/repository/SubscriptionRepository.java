package com.pell.streamaggregator.repository;

import com.pell.streamaggregator.entity.Subscription;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class SubscriptionRepository extends BaseRepository {

    private static final String SUBSCRIPTION_TABLE = "Subscription";

    public SubscriptionRepository() {
        super(SUBSCRIPTION_TABLE);
    }

    public List<Subscription> getAllSubscriptions() {
        return selectAll(Subscription.class);
    }

    public Optional<Subscription> findSubscriptionById(int id) {
        return findById(Subscription.class, id);
    }
}
