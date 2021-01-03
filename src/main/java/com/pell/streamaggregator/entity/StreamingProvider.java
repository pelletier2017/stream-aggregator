package com.pell.streamaggregator.entity;

public class StreamingProvider {
    private int streamingServiceId;
    private String name;
    private String url;

    public StreamingProvider(int streamingServiceId, String name, String url) {
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
