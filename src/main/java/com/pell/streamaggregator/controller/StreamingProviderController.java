package com.pell.streamaggregator.controller;

import com.pell.streamaggregator.entity.StreamingProvider;
import com.pell.streamaggregator.service.StreamingProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StreamingProviderController {

    @Autowired
    private StreamingProviderService streamingProviderService;

    @GetMapping("/streamingProvider")
    public List<StreamingProvider> getAllStreamingProviders() {
        return streamingProviderService.getAllStreamingProviders();
    }
}
