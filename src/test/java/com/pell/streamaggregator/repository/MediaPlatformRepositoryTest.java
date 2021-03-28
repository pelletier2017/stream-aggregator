package com.pell.streamaggregator.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MediaPlatformRepositoryTest {

    @Autowired
    MediaPlatformRepository repository;

    @Test
    public void getAllMediaPlatformsHasNoSqlErrors() throws Exception {
        repository.findAll();
    }

    @Test
    public void findMediaPlatformByIdHasNoSqlErrors() throws Exception {
        repository.findById(1L);
    }
}
