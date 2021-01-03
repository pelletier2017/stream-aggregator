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
class StreamAggregatorApplicationTest {

	private static final int DEFAULT_SQL_PORT = 1433;

	@Container
	public static DockerComposeContainer environment =
			new DockerComposeContainer(new File("docker-compose.yaml"))
					.withExposedService("database", DEFAULT_SQL_PORT, Wait.forListeningPort())
					.withPull(false)
					.withLocalCompose(true);

	@Test
	void contextLoads() {
	}

}
