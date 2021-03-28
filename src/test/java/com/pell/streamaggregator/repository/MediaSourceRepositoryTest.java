package com.pell.streamaggregator.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MediaSourceRepositoryTest {

    @Autowired
    MediaSourceRepository repository;

    @Test
    public void getAllMediaSourcesHasNoSqlErrors() throws Exception {
        repository.findAll();
    }

}
