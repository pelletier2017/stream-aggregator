
ALTER TABLE [MediaSource]
ADD FOREIGN KEY (MediaPlatformID) REFERENCES MediaPlatform(ID)

ALTER TABLE [MediaSource]
ADD FOREIGN KEY (MediaID) REFERENCES Media(ID)

ALTER TABLE [MediaSourceSubscription]
ADD FOREIGN KEY (MediaID) REFERENCES Media(ID)

ALTER TABLE [MediaSourceSubscription]
ADD FOREIGN KEY (MediaPlatformID) REFERENCES MediaPlatform(ID)

ALTER TABLE [MediaSourceSubscription]
ADD FOREIGN KEY (SubscriptionID) REFERENCES Subscription(ID)

ALTER TABLE [Media]
ADD FOREIGN KEY (DirectorID) REFERENCES Director(ID);