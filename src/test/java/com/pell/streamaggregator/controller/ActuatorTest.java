package com.pell.streamaggregator.controller;

import org.junit.jupiter.api.Test;

class ActuatorTest extends GenericControllerTest {

    @Test
    void shouldReturn200WhenSendingRequestToSpringActuator() throws Exception {
        shouldReturn200FromEndpoint("/actuator/health");
    }
}