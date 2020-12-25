package com.pell.streamaggregator;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.testcontainers.containers.DockerComposeContainer;
import org.testcontainers.containers.GenericContainer;
import org.testcontainers.containers.wait.strategy.Wait;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

import java.io.File;

@SpringBootTest
@Testcontainers
class StreamAggregatorApplicationTests {

//	@Container
//	public static GenericContainer redis = new GenericContainer("redis:3.0.6").withExposedPorts(6379);

	@Container
	public static DockerComposeContainer environment =
			new DockerComposeContainer(new File("docker-compose.yaml"))
					.withExposedService("database", 1433, Wait.forListeningPort())
					.withPull(false)
					.withLocalCompose(true);

	@Test
	void contextLoads() {
	}

}
