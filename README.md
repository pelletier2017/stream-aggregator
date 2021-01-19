# Stream Aggregator
A service which aggregates where to find movies and shows on different streaming platforms.

### Prerequisites
- docker
- docker-compose
- java 11

### Build and Test
```
# start database
docker-compose up -d

# run build and test
./gradlew clean build --info
```

# Application
### Start App
After building the project:

1. Start the database running in docker
    ```
    docker-compose up -d
    ```
1. Start the app
    ```
    ./gradlew bootRun
    ```
### Stop App
1. Kill the App process with ctrl+C
1. Stop the database
    ```
    docker-compose down
    ```
