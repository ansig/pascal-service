FROM python:3.6.5-alpine3.7

WORKDIR /app

ADD requirements.txt .
RUN apk --update add --virtual build-dependencies python3-dev build-base \
  && pip install --no-cache-dir -r requirements.txt \
  && apk del build-dependencies

ADD *.py .

ENTRYPOINT ["locust"]
CMD ["--help"]
