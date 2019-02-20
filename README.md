# Project Title

One Paragraph of project description goes here

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

### Prerequisites

* Java JDK 1.8.X
* Maven 3.6.X
* Docker 2.0.X

## Without Docker

### Installing

* mvn clean install -P<MAVEN_PROFILE> (prod by default)

example:

* mvn clean install -Pdev (for the dev configuration)

### Running the tests

* mvn clean test

### Running the application

* java -jar target/api-meal-0.0.1.jar (running on 8080 by default)
* java -jar target/sample-api-0.0.1.jar --server.port=<PORT_AVAILABLE>

## With Docker

### Installing

Creating the .jar file:
* mvn clean install -Plocal<MAVEN_PROFILE>

Building the Docker container:
* docker build -t <DOCKER_PROFILE>/sample-api .

### Running the application

Starting the Docker container
* docker run -p 8080:8080 -t <DOCKER_PROFILE>/api-meal

###Deploy the container on your DockerHub

* docker push <DOCKER_PROFILE>/api-meal
## Built With

* [Docker](https://www.docker.com/) - Deployment helper
* [Maven](https://maven.apache.org/) - Dependency Management

## Versioning

We use [SemVer](http://semver.org/) for versioning. For the versions available, see the [tags on this repository](https://github.com/your/project/tags). 

## Authors

* **Victor FAVREAU** - *Initial work* - [VictorFavreau](https://github.com/VictorFavreau)

See also the list of [contributors](https://github.com/your/project/contributors) who participated in this project.

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details