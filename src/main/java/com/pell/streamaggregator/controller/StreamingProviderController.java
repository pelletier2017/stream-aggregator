package com.pell.streamaggregator.controller;

import com.pell.streamaggregator.entity.StreamingProvider;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StreamingProviderController {

    @GetMapping("/streamingServices")
    @ResponseBody
    public StreamingProvider getStreamingService() {
        return new StreamingProvider(1, "amazon", "www.amazon.com");
    }
}
