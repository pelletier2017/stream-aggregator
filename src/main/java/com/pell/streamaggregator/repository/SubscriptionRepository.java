package com.pell.streamaggregator.repository;

import com.pell.streamaggregator.entity.Subscription;
import org.springframework.data.repository.CrudRepository;

public interface SubscriptionRepository extends CrudRepository<Subscription, Long> {

}
