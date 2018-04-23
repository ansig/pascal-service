# Pascal Service

This is a Spring Boot Rest App sample used for demonstrations.

# Build and run

The project can be built and run standalone or in a Docker container. In both cases, Gradle is used for the build.

## Standalone

First build the application with the Gradle wrapper:

```bash
$ ./gradlew build
```

Start the application by executing the `jar` file:

```bash
$ java -jar build/libs/pascal-service-1.0.jar
```

## Docker 

You can build the Docker container manually, but you may also use the Gradle task to do so:

```bash
$ ./gradlew docker
```

To run the Docker container:

```bash
$ docker run -p 80:8080 se.ansig.sample.spring/pascal-service 
```

## Accessing the service

Once the service has been  built and started, it can be accessed on either the default `8080` port or on whatever port you forwarded to the Docker container:

```bash
$ curl localhost:8080/pascal/row/6
{"numbers":[1,5,10,10,5,1]}
```

## Kubernetes
kubectl cheat sheet: https://kubernetes.io/docs/reference/kubectl/cheatsheet/
