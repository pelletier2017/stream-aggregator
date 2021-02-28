USE StreamAggregator;

-- Insert sample data
INSERT INTO Director ([FirstName],[LastName],[DOB]) VALUES ('Bernard', 'Rose','1950-08-04');
INSERT INTO Director ([FirstName],[LastName],[DOB]) VALUES ('Ida', 'Lupino','1918-02-04');
INSERT INTO Director ([FirstName],[LastName],[DOB]) VALUES ('David', 'Cronenberg','1943-03-15');
INSERT INTO Director ([FirstName],[LastName],[DOB]) VALUES ('Sidney', 'Lumet','1924-06-25');
INSERT INTO Director ([FirstName],[LastName],[DOB]) VALUES ('Wood', 'Allen','1935-12-01');

SELECT * FROM Director;

--DELETE FROM Director WHERE FirstName='Ivan';
--DELETE FROM Media WHERE Name='The Brood';

INSERT INTO Media ([Name],[DirectorID],[ProductionYear],[RuntimeMinutes],[SummaryUrl]) 
VALUES ('The Brood', '3','1979','92','www.imdb.com/title/tt0078908/?ref_=nm_flmg_dr_23');
INSERT INTO Media ([Name],[DirectorID],[ProductionYear],[RuntimeMinutes],[SummaryUrl]) 
VALUES ('The Fly', '3','1986','96','www.imdb.com/title/tt0091064/?ref_=nm_flmg_dr_19');
INSERT INTO Media ([Name],[DirectorID],[ProductionYear],[RuntimeMinutes],[SummaryUrl]) 
VALUES ('Scanners', '3','1981','103','www.imdb.com/title/tt0081455/?ref_=nm_flmg_dr_22');
INSERT INTO Media ([Name],[DirectorID],[ProductionYear],[RuntimeMinutes],[SummaryUrl]) 
VALUES ('Videodrome', '3','1983','89','www.imdb.com/title/tt0086541/?ref_=nm_flmg_dr_21');
INSERT INTO Media ([Name],[DirectorID],[ProductionYear],[RuntimeMinutes],[SummaryUrl]) 
VALUES ('The Dead Zone', '3','1983','103','www.imdb.com/title/tt0085407/?ref_=nm_flmg_dr_20');

SELECT *
FROM Media

SELECT *
FROM MediaSource

SELECT *
FROM MediaPlatform

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

SELECT *
FROM MediaSource

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

SELECT *
FROM MediaSourceSubscription

SELECT *
FROM Subscription

INSERT INTO Subscription ([Name],[URL],[MonthlyPrice]) 
VALUES ('HBO','www.hbomax.com','9.99');
INSERT INTO Subscription ([Name],[URL],[MonthlyPrice]) 
VALUES ('Stars','www.fakestarsaddress.com','12.99');
INSERT INTO Subscription ([Name],[URL],[MonthlyPrice]) 
VALUES ('Disney','www.disneyfakeaddress.com','15.99');
INSERT INTO Subscription ([Name],[URL],[MonthlyPrice]) 
VALUES ('Showtime','www.showtimefakeaddress.com','9.99');
INSERT INTO Subscription ([Name],[URL],[MonthlyPrice]) 
VALUES ('Fox','www.foxfakeaddress.com','21.99');

SELECT *
