##Getting Started

The following ReadME.md will layout the tables underlining W4 in SQL, and the underlying logic behind their arrangement

###Prerequisites

Before you begin you should have Microsoft SQL Server installed if you wish to view the SQL Files themselves
[Microsoft SQL Server Download Page](https://www.microsoft.com/en-us/sql-server/sql-server-downloads)

Or you should open the LucidChart File if you want to follow along
[LucidChart Link](https://lucid.app/lucidchart/invitations/accept/6ceb4112-44d9-4ca3-897a-d2e206c7489a)

##Tables

### Availability

| Key |  Column | Datatype |
| --- | --- | --- |
| PK |  FilmID| Int Identity(1,1) |
| PK FK  | StreamingServiceID |  Int |
|   | Available | Bit  |
|   | Rentable | Bit |
|   |  Buyable | Bit|
|   | RentPrice  |  Decimal |
|   | BuyPrice  |  Decimal |
|   | SubscriptionId  |  Int |

This is intended to be the 'core' table of the SQLDatabase answering whether a film is available or not, and if it is can you rent or buy it.

Tables Film,Director and StreamingService build off of it adding additional information that adds readability and can aid in user selections

### Director

| Key |  Column | Datatype |
| --- | --- | --- |
| PK  |  DirectorID | Int Identity(1,1) |
|   |  Name |  varchar(30) |
|   |  DOB |  Date |

This table is intended to increase provide additional information on the director of the film including DOB and name, which should aid the user if they wish to sort by the work of a given film director.

### Film

| Key |  Column | Datatype |
| --- | --- | --- |
| PK |  FilmID| Int Identity(1,1) |
|   | Name  |  varchar(30) |
|   | FilmDirectorID  | Int  |
|   | ProductionYear  | Int  |
|   |  RuntimeMinutes | Int |
|   | FilmSummaryURL  |  varchar(50) |


This table is intended to increase readability when sorting for films. Some additional points to aid users in making decisions are ProductionYear which lists what year the filmn was first widely release,Runtimeminutes which as the name implies tells you how long the film in and DirectorID, which with the director table can be used to work out a director's body of work.

Film Summary URL is intended to allow a URL where the user can read a short description on the film. Tentatively, IMDB is likely going to be the default source here.

### StreamingService

| Key |  Column | Datatype |
| --- | --- | --- |
| PK   | StreamingServiceID  | Int Identity(1,1) |
|   |  Name |  varchar(30) |
|   | URL  | varchar(50) Not Null  |

This table is intended to provide additional readability on the various streaming platforms that movies are avaiability on, including their URLs and the streaming platform names.
### Subscription Availability
| Key |  Column | Datatype |
| --- | --- | --- |
|  PK |  SubscriptionID |  INT |
|  PK | FilmId  | INT  |
|  PK | StreamingServiceId  |  INT |

### Subscription

| Key |  Column | Datatype |
| --- | --- | --- |
| PK  | SubscriptionID   | Int Identity(1,1) |
|   |  name |  varchar(30) |
|   |  URL |  Date |
|   | MonthlyPrice  | Decimal  |

Stream Availability and Subscription are intended to address the specific scenario of there being a premium content on a subscription service like Netflix HBO that some shows are locked behind and require additional subscriptions beyond the show itself