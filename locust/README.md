# Locust tests

This folder contains an example setup for running Locust load tests against the Pascal service.

# Running the tests

To run the tests you need to start the Locust server and point it to a running instance of the Pascal service.

## Standalone

To run it standalone you need `Python 3` installed.

```bash
$ pip install -r requirements.txt
$ locust -f locustfile.py --host=http://<HOST>:<PORT>
```

## Docker compose

You can also run the Locust tests in a Docker environment. First build the Pascal service Docker container and then run:

```bash
$ docker-compose up
```
