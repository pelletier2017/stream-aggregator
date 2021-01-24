package com.pell.streamaggregator.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DirectorRepositoryTest {

    @Autowired
    DirectorRepository repository;

    @Test
    public void getAllDirectorsHasNoSqlErrors() throws Exception {
        repository.getAllDirectors();
    }
}
