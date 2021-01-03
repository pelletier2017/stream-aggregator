package com.pell.streamaggregator.controller;

import com.pell.streamaggregator.entity.StreamingProvider;
import com.pell.streamaggregator.service.StreamingProviderService;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(controllers = StreamingProviderController.class)
class StreamingProviderControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private StreamingProviderService streamingProviderService;

    @Before
    public void setUp() {
        List<StreamingProvider> mockProviders = List.of(new StreamingProvider(1, "fake", "www.fake.com"));
        when(streamingProviderService.getStreamingProviders()).thenReturn(mockProviders);
    }

    @Test
    public void getStreamingServiceReturns200() throws Exception {
        mockMvc.perform(get("/streamingProvider"))
                .andExpect(status().isOk());
    }
}