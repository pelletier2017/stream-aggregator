--Update Script

SELECT *
FROM Director

--Below Modifys the Director Table

ALTER TABLE DIRECTOR --Ensures Directors have a name
ALTER COLUMN Name varchar(30) NOT NULL;

ALTER TABLE StreamingService --Ensures Streaming Service have Names
ALTER COLUMN Name varchar(30) NOT NULL;

ALTER TABLE StreamingService --Adds Unique to URL Column for StreamingService
ADD UNIQUE (URL)

ALTER TABLE Film--Ensures Films have a name
ALTER COLUMN Name varchar(30) NOT NULL;

ALTER TABLE Subscription --Ensures Subscription has a name 
ALTER COLUMN Name varchar(30) NOT NULL; 
