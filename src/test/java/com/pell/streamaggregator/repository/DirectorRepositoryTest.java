package com.pell.streamaggregator.repository;

import com.pell.streamaggregator.entity.Director;
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
public class DirectorRepositoryTest {

    @Autowired
    DirectorRepository repository;

    @SpyBean
    private JdbcTemplate jdbcTemplate;

    @Test
    public void getAllDirectorsHasNoSqlErrors() throws Exception {
        repository.getAllDirectors();
        Mockito.verify(jdbcTemplate).query(anyString(), ArgumentMatchers.<BeanPropertyRowMapper<Director>>any());
    }

    @Test
    public void findDirectorByIdHasNoSqlErrors() throws Exception {
        repository.findDirectorById(1);
        Mockito.verify(jdbcTemplate).query(anyString(), ArgumentMatchers.<BeanPropertyRowMapper<Director>>any());
    }
}
