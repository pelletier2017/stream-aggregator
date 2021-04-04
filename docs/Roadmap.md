Application Feature Goals:
1. From list of movies and shows, show which streaming platform it exists on
1. Periodically query streaming services to get updated data
1. Additional fields for price, rent, buy under each platform
1. Fuzzy search for movies/shows with auto-complete

Project Goals:
1. Git commit with passing tests results in deployment to cloud infrastructure (CICD)
1. Run all tests with 1 command
1. Comprehensive docs to build, test, and run any part of the project
1. All changes made through pull requests
1. Everything in the project exists on github

Operational Goals:
1. Automated database backups
1. Highly available across multiple cloud availability zones
1. Stateless web-app that is horizontally scalable using autoscaling group
1. Extensive monitoring allowing visibility into health of system

Technology overview:

SQL DBMS
- Microsoft SQL-Server

Web App
- Spring Boot MVC (Java)

Build Tool
- Gradle

Testing
- JUnit 5
- Test Containers

Packaging
- Amazon Machine Image (AMI) (TODO)
- Packer (TODO)

CICD
- Github Actions

Cloud Deployment
- Terraform (AWS)

Scrum Board
- Trello