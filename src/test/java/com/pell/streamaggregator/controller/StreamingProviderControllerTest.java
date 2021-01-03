package com.pell.streamaggregator.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(controllers = StreamingProviderController.class)
class StreamingProviderControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void getStreamingServiceReturns200() throws Exception {
        mockMvc.perform(get("/streamingServices"))
                .andExpect(status().isOk());
    }
}