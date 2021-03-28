package com.pell.streamaggregator.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.pell.streamaggregator.controller.crud.MediaPlatformController;
import com.pell.streamaggregator.entity.MediaPlatform;
import com.pell.streamaggregator.service.crud.MediaPlatformService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(controllers = MediaPlatformController.class)
class MediaPlatformControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    private static final List<MediaPlatform> MOCK_PLATFORMS = List.of(
            new MediaPlatform(1, "fake", "www.fake.com")
    );

    private static final String MEDIA_PLATFORMS_PATH = "/api/media-platforms";

    @MockBean
    private MediaPlatformService mediaPlatformService;

    @BeforeEach
    public void setUp() {
        when(mediaPlatformService.getAll()).thenReturn(MOCK_PLATFORMS);
    }

    @Test
    public void getMediaPlatformsReturns200() throws Exception {
        mockMvc.perform(get(MEDIA_PLATFORMS_PATH))
                .andExpect(status().isOk());
    }

    @Test
    public void getMediaPlatformsReturnsServiceResponse() throws Exception {
        MvcResult result = mockMvc.perform(get(MEDIA_PLATFORMS_PATH)).andReturn();
        String responseBody = result.getResponse().getContentAsString();

        assertThat(responseBody).isEqualToIgnoringWhitespace(objectMapper.writeValueAsString(MOCK_PLATFORMS));
    }

    @Test
    public void postMediaPlatformsReturns200() throws Exception {
        String json = objectMapper.writeValueAsString(MOCK_PLATFORMS.get(0));
        mockMvc.perform(post(MEDIA_PLATFORMS_PATH)
                .contentType(MediaType.APPLICATION_JSON)
                .content(json))
                .andExpect(status().isOk());
    }
}