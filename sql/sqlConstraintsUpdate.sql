--Update Script

--Below Modifys the Director Table

--reference text for some common constraint commands
--ALTER TABLE DIRECTOR --Ensures Directors have a name 
--ALTER COLUMN Name varchar(30) NOT NULL;

--ALTER TABLE StreamingService --Adds Unique to URL Column for StreamingService
--ADD UNIQUE (URL)