package com.pell.streamaggregator.service;

import com.pell.streamaggregator.entity.StreamingProvider;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StreamingProviderService {

    public List<StreamingProvider> getStreamingProviders() {
        return List.of(new StreamingProvider(1, "amazon", "www.amazon.com"));
    }

}
