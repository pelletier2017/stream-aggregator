package com.pell.streamaggregator.repository;

import com.pell.streamaggregator.entity.MediaPlatform;
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
public class MediaPlatformRepositoryTest {

    @Autowired
    MediaPlatformRepository repository;

    @SpyBean
    private JdbcTemplate jdbcTemplate;

    @Test
    public void getAllMediaPlatformsHasNoSqlErrors() throws Exception {
        repository.getAllMediaPlatforms();
        Mockito.verify(jdbcTemplate).query(anyString(), ArgumentMatchers.<BeanPropertyRowMapper<MediaPlatform>>any());
    }

    @Test
    public void findMediaPlatformByIdHasNoSqlErrors() throws Exception {
        repository.findMediaPlatformById(1);
        Mockito.verify(jdbcTemplate).query(anyString(), ArgumentMatchers.<BeanPropertyRowMapper<MediaPlatform>>any());
    }
}
