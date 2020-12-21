package com.pell.streamaggregator.controller;

import org.junit.jupiter.api.Test;

class StreamingServiceControllerTest extends GenericControllerTest {

    @Test
    void shouldReturn200WhenSendingRequestToGetStreamingService() throws Exception {
        shouldReturn200FromEndpoint("/streamingServices");
    }
}