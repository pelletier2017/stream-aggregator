# Stream Aggregator

![build status](https://github.com/pelletier2017/stream-aggregator/workflows/Build/badge.svg)

A service which aggregates where to find movies and shows on different streaming platforms.

### Prerequisites
- docker
- docker-compose
- java 11

### Build and Test
Before running tests, start the database running in docker. See [Start Database](#start-database)
```
# run build and test
./gradlew clean build --info
```

## Application
### Start App
After building the project:

1. Start the database running in docker. See [Start Database](#start-database)

1. Start the app
    ```
    ./gradlew bootRun
    ```
### Stop App
1. Kill the App process with ctrl+C
1. Stop the database. See [Stop Database](#stop-database)

## Database
The Sql Server Database Management System (DBMS) runs in a docker container alongside the app.
### Start Database
```
docker-compose up -d --build
```

### Stop Database
```
docker-compose down
```

### Access Database
1. Wait at least a minute from starting the Docker Database.
2. Using SQL Server switch authentication method to SQL Server Authentication. 
3. Use Login "sa" password listed in .env
4. Change ServerName to "localhost" 

