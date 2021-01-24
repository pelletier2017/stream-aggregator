package com.pell.streamaggregator.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SubscriptionRepositoryTest {

    @Autowired
    SubscriptionRepository repository;

    @Test
    public void getAllSubscriptionsHasNoSqlErrors() throws Exception {
        repository.getAllSubscriptions();
    }
}
