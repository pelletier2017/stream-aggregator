package com.pell.streamaggregator.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class SpringBootActuatorTest {

    private static final String ACTUATOR_PATH = "/actuator/health";

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void actuatorEndpointIsAvailable() throws Exception {
        mockMvc.perform(get(ACTUATOR_PATH))
                .andExpect(status().isOk());
    }
}