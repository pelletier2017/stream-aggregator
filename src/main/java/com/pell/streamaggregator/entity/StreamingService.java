package com.pell.streamaggregator.entity;

public class StreamingService {
    private int streamingServiceId;
    private String name;
    private String url;

    public StreamingService(int streamingServiceId, String name, String url) {
        this.streamingServiceId = streamingServiceId;
        this.name = name;
        this.url = url;
    }

    public int getStreamingServiceId() {
        return streamingServiceId;
    }

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }
}
