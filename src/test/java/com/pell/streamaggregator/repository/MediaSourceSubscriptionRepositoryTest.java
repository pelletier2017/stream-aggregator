package com.pell.streamaggregator.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MediaSourceSubscriptionRepositoryTest {

    @Autowired
    MediaSourceSubscriptionRepository repository;

    @Test
    public void getAllMediaSourceSubscriptionsHasNoSqlErrors() throws Exception {
        repository.findAll();
    }

}
