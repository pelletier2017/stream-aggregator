package com.pell.streamaggregator.repository;

import com.pell.streamaggregator.entity.Subscription;
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
public class SubscriptionRepositoryTest {

    @Autowired
    SubscriptionRepository repository;

    @SpyBean
    private JdbcTemplate jdbcTemplate;

    @Test
    public void getAllSubscriptionsHasNoSqlErrors() throws Exception {
        repository.getAllSubscriptions();
        Mockito.verify(jdbcTemplate).query(anyString(), ArgumentMatchers.<BeanPropertyRowMapper<Subscription>>any());
    }

    @Test
    public void findMediaSourceSubscriptionsByIdHasNoSqlErrors() throws Exception {
        repository.findSubscriptionById(1);
        Mockito.verify(jdbcTemplate).query(anyString(), ArgumentMatchers.<BeanPropertyRowMapper<Subscription>>any());
    }
}
