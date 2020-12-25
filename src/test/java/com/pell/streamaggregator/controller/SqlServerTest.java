package com.pell.streamaggregator.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.testcontainers.containers.GenericContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

import java.util.Map;

import static org.assertj.core.api.BDDAssertions.then;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@Testcontainers
class SqlServerTest {

//    @ClassRule
//    public MSSQLServerContainer mssqlserver = new MSSQLServerContainer()
//            .acceptLicense();

//    @ClassRule
//    public static PostgreSQLContainer postgreSQLContainer = new PostgreSQLContainer("postgres:11.1")
//            .withDatabaseName("integration-tests-db")
//            .withUsername("sa")
//            .withPassword("sa");

    @Container
    public static GenericContainer redis = new GenericContainer("redis:3.0.6").withExposedPorts(6379);


//    // container {
//    @Container
//    public GenericContainer redis = new GenericContainer(DockerImageName.parse("redis:5.0.3-alpine"))
//            .withExposedPorts(6379);
//    // }
//
//
//    @BeforeEach
//    public void setUp() {
//        String address = redis.getHost();
//        Integer port = redis.getFirstMappedPort();
//
//        // Now we have an address and port for Redis, no matter where it is running
//        underTest = new RedisBackedCache(address, port);
//    }
//
    @Test
    public void testSimplePutAndGet() {
        System.out.println("hello world");
    }
}