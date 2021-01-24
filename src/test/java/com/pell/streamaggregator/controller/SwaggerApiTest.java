package com.pell.streamaggregator.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.redirectedUrl;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class SwaggerApiTest {

    private static final String SWAGGER_JSON_PATH = "/v3/api-docs/";

    private static final String SWAGGER_HTML_PATH = "/swagger-ui.html";

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void swaggerJsonEndpointIsAvailable() throws Exception {
        mockMvc.perform(get(SWAGGER_JSON_PATH))
                .andExpect(status().isOk());
    }

    @Test
    public void swaggerHtmlEndpointIsAvailable() throws Exception {
        mockMvc.perform(get(SWAGGER_HTML_PATH))
                .andExpect(status().isFound());
    }
}