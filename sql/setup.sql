CREATE DATABASE StreamAggregator;
GO

USE StreamAggregator;

-- Everything below this point is exported from Lucid Chart

CREATE TABLE [Subscription] (
  [ID] Int Identity(1,1),
  [Name] varchar(30) Not Null,
  [URL] varchar(30),
  [MonthlyPrice] Decimal,
  PRIMARY KEY ([ID])
);

CREATE TABLE [MediaSourceSubscription] (
  [SubscriptionID] INT,
  [MediaId] INT,
  [MediaPlatformID] INT,
  PRIMARY KEY ([SubscriptionID], [MediaId], [MediaPlatformID])
);

CREATE TABLE [MediaSource] (
  [MediaID] Int,
  [MediaPlatformID] Int,
  [Available] Bit,
  [Rentable] Bit,
  [Buyable] Bit,
  [RentPrice] Decimal,
  [BuyPrice] Decimal,
  PRIMARY KEY ([MediaID], [MediaPlatformID])
);

CREATE TABLE [MediaPlatform] (
  [ID] Int Identity(1,1),
  [Name] varchar(30) Not Null,
  [URL] varchar(50) Not Null Unique,
  PRIMARY KEY ([ID])
);

CREATE TABLE [Director] (
  [ID] Int Identity(1,1),
  [FirstName] varchar(20) Not Null,
  [LastName] varchar(20) Not Null,
  [DOB] Date,
  PRIMARY KEY ([ID])
);

CREATE TABLE [Media] (
  [ID] Int Identity(1,1),
  [Name] varchar(30),
  [DirectorID] Int,
  [ProductionYear] Int,
  [RuntimeMinutes] Int,
  [SummaryUrl] varchar(50),
  PRIMARY KEY ([ID])
);

--This is an addon to add foreign keys(which are a bit unwieldy in lucid chart")

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