package com.pell.streamaggregator.repository;

import com.pell.streamaggregator.entity.MediaSource;
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
public class MediaSourceRepositoryTest {

    @Autowired
    MediaSourceRepository repository;

    @SpyBean
    private JdbcTemplate jdbcTemplate;

    @Test
    public void getAllMediaSourcesHasNoSqlErrors() throws Exception {
        repository.getAllMediaSources();
        Mockito.verify(jdbcTemplate).query(anyString(), ArgumentMatchers.<BeanPropertyRowMapper<MediaSource>>any());
    }

    // TODO remove this @Disabled after implementing the method
    @Disabled
    @Test
    public void findMediaSourceByIdHasNoSqlErrors() throws Exception {
        repository.findMediaSourceById(3, 7);
        Mockito.verify(jdbcTemplate).query(anyString(), ArgumentMatchers.<BeanPropertyRowMapper<MediaSource>>any());
    }
}
