USE StreamAggregator;

-- Insert sample data
INSERT INTO MediaPlatform ([Name], [URL]) VALUES ('Amazon', 'www.amazon.com');
INSERT INTO MediaPlatform ([Name], [URL]) VALUES ('Hulu', 'www.hulu.com');
INSERT INTO MediaPlatform ([Name], [URL]) VALUES ('Netflix', 'www.netflix.com');

SELECT * FROM MediaPlatform;
