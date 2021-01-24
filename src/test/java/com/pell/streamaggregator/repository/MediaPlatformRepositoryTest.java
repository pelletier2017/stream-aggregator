package com.pell.streamaggregator.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@SpringBootTest
public class MediaPlatformRepositoryTest {

    @Autowired
    MediaPlatformRepository repository;

    @Test
    public void getAllMediaPlatformsHasNoSqlErrors() throws Exception {
        repository.getAllMediaPlatforms();
    }
}
