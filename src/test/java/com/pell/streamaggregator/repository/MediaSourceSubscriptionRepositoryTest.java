package com.pell.streamaggregator.repository;

import com.pell.streamaggregator.entity.MediaSourceSubscription;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.SpyBean;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import static org.mockito.ArgumentMatchers.anyString;

@SpringBootTest
public class MediaSourceSubscriptionRepositoryTest {

    @Autowired
    MediaSourceSubscriptionRepository repository;

    @SpyBean
    private JdbcTemplate jdbcTemplate;

    @Test
    public void getAllMediaSourceSubscriptionsHasNoSqlErrors() throws Exception {
        repository.getAllMediaSourceSubscriptions();
        Mockito.verify(jdbcTemplate).query(anyString(), ArgumentMatchers.<BeanPropertyRowMapper<MediaSourceSubscription>>any());
    }

    // TODO remove this @Disabled after implementing the method
    @Disabled
    @Test
    public void findMediaSourceSubscriptionsByIdHasNoSqlErrors() throws Exception {
        repository.findMediaSourceSubscriptionById(1, 2, 3);
        Mockito.verify(jdbcTemplate).query(anyString(), ArgumentMatchers.<BeanPropertyRowMapper<MediaSourceSubscription>>any());
    }
}
