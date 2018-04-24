#!/usr/bin/python3

import random
from locust import HttpLocust, TaskSet, task

class UserBehavior(TaskSet):

    @task
    def get_pascal_row(self):
        self.client.get("/pascal/row/%d" % random.randint(1,10))

class WebsiteUser(HttpLocust):
    task_set = UserBehavior
