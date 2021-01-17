package com.pell.streamaggregator.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.pell.streamaggregator.entity.StreamingProvider;
import com.pell.streamaggregator.service.StreamingProviderService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(controllers = StreamingProviderController.class)
class StreamingProviderControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    private static final List<StreamingProvider> MOCK_PROVIDERS = List.of(
            new StreamingProvider(1, "fake", "www.fake.com")
    );

    private static final String STREAM_PROVIDER_PATH = "/streamingProvider";

    @MockBean
    private StreamingProviderService streamingProviderService;

    @BeforeEach
    public void setUp() {
        when(streamingProviderService.getAllStreamingProviders()).thenReturn(MOCK_PROVIDERS);
    }

    @Test
    public void getStreamingServiceReturns200() throws Exception {
        mockMvc.perform(get(STREAM_PROVIDER_PATH))
                .andExpect(status().isOk());
    }

    @Test
    public void getStreamingServiceReturnsServiceResponse() throws Exception {
        MvcResult result = mockMvc.perform(get(STREAM_PROVIDER_PATH)).andReturn();
        String responseBody = result.getResponse().getContentAsString();

        assertThat(responseBody).isEqualToIgnoringWhitespace(objectMapper.writeValueAsString(MOCK_PROVIDERS));
    }
}