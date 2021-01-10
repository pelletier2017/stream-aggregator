CREATE TABLE `Availability` (
  `FilmID` Int Identity(1,1),
  `StreamingServiceID` Int,
  `Available` Bit,
  `Rentable` Bit,
  `Buyable` Bit,
  `RentPrice` Decimal,
  `BuyPrice` Decimal,
  `SubscriptionId` Int,
  PRIMARY KEY (`FilmID`),
  KEY `PK FK` (`StreamingServiceID`)
);

CREATE TABLE `Film` (
  `FilmID` Int Identity(1,1),
  `Name` varchar(30),
  `FilmDirectorID` Int,
  `ProductionYear` Int,
  `RuntimeMinutes` Int,
  `FilmSummaryUrl` varchar(50),
  PRIMARY KEY (`FilmID`)
);

CREATE TABLE `StreamingService` (
  `StreamingServiceID` Int Identity(1,1),
  `Name` varchar(30) ,
  `URL` varchar(50) Not Null,
  PRIMARY KEY (`StreamingServiceID`)
);

CREATE TABLE `Director` (
  `DirectorID` Int Identity(1,1),
  `Name` varchar(30),
  `DOB` Date,
  PRIMARY KEY (`DirectorID`)
);

CREATE TABLE `Subscription` (
  `SubscriptionID` Int Identity(1,1),
  `Name` varchar(30),
  `URL` varchar(30),
  `MonthlyPrice` Decimal,
  PRIMARY KEY (`SubscriptionID`)
);

CREATE TABLE `SubscriptionAvailability` (
  `SubscriptionID` INT,
  `FilmId` INT,
  `StreamingServiceId` INT,
  PRIMARY KEY (`SubscriptionID`, `FilmId`, `StreamingServiceId`)
);