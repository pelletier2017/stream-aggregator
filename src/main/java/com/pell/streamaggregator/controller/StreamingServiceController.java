package com.pell.streamaggregator.controller;

import com.pell.streamaggregator.entity.StreamingService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StreamingServiceController {

    @GetMapping("/streamingServices")
    @ResponseBody
    public StreamingService getStreamingService() {
        return new StreamingService(1, "amazon", "www.amazon.com");
    }
}
