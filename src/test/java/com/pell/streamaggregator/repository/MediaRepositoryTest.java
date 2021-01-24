package com.pell.streamaggregator.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MediaRepositoryTest {

    @Autowired
    MediaRepository repository;

    @Test
    public void getAllMediaHasNoSqlErrors() throws Exception {
        repository.getAllMedia();
    }

    @Test
    public void findMediaByIdHasNoSqlErrors() throws Exception {
        repository.findMediaById(1);
    }
}
