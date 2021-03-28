USE StreamAggregator;

-- set identity off for tables that have IDENTITY property to allow us to insert specific primary keys
SET IDENTITY_INSERT Director ON;
INSERT INTO Director ([ID],[FirstName],[LastName],[DOB]) VALUES ('1', 'Bernard', 'Rose','1950-08-04');
INSERT INTO Director ([ID],[FirstName],[LastName],[DOB]) VALUES ('2', 'Ida', 'Lupino','1918-02-04');
INSERT INTO Director ([ID],[FirstName],[LastName],[DOB]) VALUES ('3', 'David', 'Cronenberg','1943-03-15');
INSERT INTO Director ([ID],[FirstName],[LastName],[DOB]) VALUES ('4', 'Sidney', 'Lumet','1924-06-25');
INSERT INTO Director ([ID],[FirstName],[LastName],[DOB]) VALUES ('5', 'Wood', 'Allen','1935-12-01');
SELECT * FROM Director;
SET IDENTITY_INSERT Director OFF;

SET IDENTITY_INSERT Media ON;
INSERT INTO Media ([ID],[Name],[DirectorID],[ProductionYear],[RuntimeMinutes],[SummaryUrl])
VALUES ('1', 'The Brood', '3','1979','92','www.imdb.com/title/tt0078908/?ref_=nm_flmg_dr_23');
INSERT INTO Media ([ID],[Name],[DirectorID],[ProductionYear],[RuntimeMinutes],[SummaryUrl])
VALUES ('2', 'The Fly', '3','1986','96','www.imdb.com/title/tt0091064/?ref_=nm_flmg_dr_19');
INSERT INTO Media ([ID],[Name],[DirectorID],[ProductionYear],[RuntimeMinutes],[SummaryUrl])
VALUES ('3', 'Scanners', '3','1981','103','www.imdb.com/title/tt0081455/?ref_=nm_flmg_dr_22');
INSERT INTO Media ([ID],[Name],[DirectorID],[ProductionYear],[RuntimeMinutes],[SummaryUrl])
VALUES ('4', 'Videodrome', '3','1983','89','www.imdb.com/title/tt0086541/?ref_=nm_flmg_dr_21');
INSERT INTO Media ([ID],[Name],[DirectorID],[ProductionYear],[RuntimeMinutes],[SummaryUrl])
VALUES ('5', 'The Dead Zone', '3','1983','103','www.imdb.com/title/tt0085407/?ref_=nm_flmg_dr_20');
SELECT * FROM Media
SET IDENTITY_INSERT Media OFF;

SET IDENTITY_INSERT Subscription ON;
INSERT INTO Subscription ([ID],[Name],[URL],[MonthlyPrice])
VALUES ('1', 'HBO','www.hbomax.com','9.99');
INSERT INTO Subscription ([ID],[Name],[URL],[MonthlyPrice])
VALUES ('2', 'Stars','www.fakestarsaddress.com','12.99');
INSERT INTO Subscription ([ID],[Name],[URL],[MonthlyPrice])
VALUES ('3', 'Disney','www.disneyfakeaddress.com','15.99');
INSERT INTO Subscription ([ID],[Name],[URL],[MonthlyPrice])
VALUES ('4', 'Showtime','www.showtimefakeaddress.com','9.99');
INSERT INTO Subscription ([ID],[Name],[URL],[MonthlyPrice])
VALUES ('5', 'Fox','www.foxfakeaddress.com','21.99');
SELECT * FROM Subscription
SET IDENTITY_INSERT Subscription OFF;

SET IDENTITY_INSERT MediaPlatform ON;
INSERT INTO MediaPlatform ([ID],[Name],[URL])
VALUES ('1', 'Netflix','www.netflix.com');
INSERT INTO MediaPlatform  ([ID],[Name],[URL])
VALUES ('2', 'Amazon Prime','www.amazon.com/prime');
INSERT INTO MediaPlatform  ([ID],[Name],[URL])
VALUES ('3', 'Hulu','www.hulu.com');
INSERT INTO MediaPlatform  ([ID],[Name],[URL])
VALUES ('4', 'Sling TV','www.sling.com');
INSERT INTO MediaPlatform  ([ID],[Name],[URL])
VALUES ('5', 'Fubo TV','www.fubo.tv');
SELECT * FROM MediaPlatform
SET IDENTITY_INSERT MediaPlatform OFF;

INSERT INTO MediaSource ([MediaID],[MediaPlatformID],[Available],[Rentable],[Buyable],[RentPrice],[BuyPrice])
VALUES ('1', '1','1','0','1','0','19.99');
INSERT INTO MediaSource ([MediaID],[MediaPlatformID],[Available],[Rentable],[Buyable],[RentPrice],[BuyPrice])
VALUES ('2', '2','1','1','1','2.99','19.99');
INSERT INTO MediaSource ([MediaID],[MediaPlatformID],[Available],[Rentable],[Buyable],[RentPrice],[BuyPrice])
VALUES ('3', '3','1','1','1','2.99','19.99');
INSERT INTO MediaSource ([MediaID],[MediaPlatformID],[Available],[Rentable],[Buyable],[RentPrice],[BuyPrice])
VALUES ('4', '1','1','1','0','2.99','0');
INSERT INTO MediaSource ([MediaID],[MediaPlatformID],[Available],[Rentable],[Buyable],[RentPrice],[BuyPrice])
VALUES ('5', '2','1','1','1','2.99','19.99');
SELECT * FROM MediaSource

INSERT INTO MediaSourceSubscription ([SubscriptionID],[MediaId],[MediaPlatformID])
VALUES ('1','1','1');
INSERT INTO MediaSourceSubscription ([SubscriptionID],[MediaId],[MediaPlatformID])
VALUES ('2','2','2');
INSERT INTO MediaSourceSubscription ([SubscriptionID],[MediaId],[MediaPlatformID])
VALUES ('3','3','3');
INSERT INTO MediaSourceSubscription ([SubscriptionID],[MediaId],[MediaPlatformID])
VALUES ('1','4','1');
INSERT INTO MediaSourceSubscription ([SubscriptionID],[MediaId],[MediaPlatformID])
VALUES ('5','5','2');
SELECT * FROM MediaSourceSubscription
