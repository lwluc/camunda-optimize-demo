# Optimize Demo  <!-- omit in toc -->

[Camunda Micronaut BPM](https://github.com/camunda-community-hub/micronaut-camunda-bpm) Demo with an example Process running in the [Camunda Platform](https://docs.camunda.org/manual/7.16/), which is connected to [Camunda Optimize](https://docs.camunda.io/docs/components/optimize/what-is-optimize/).

## Table of Contents <!-- omit in toc -->

- [✨Features](#features)
  - [🗺 Optimize](#-optimize)
  - [⚙️ Camunda Platform](#️-camunda-platform)
  - [🔨 Camunda Worker](#-camunda-worker)
- [🚀Getting Started](#getting-started)
  - [☸️Kubernetes](#️kubernetes)
  - [🐳Docker](#docker)

## ✨Features

### 🗺 Optimize

Have a look at the running instance: [Camunda Optimize](http://localhost:8090)

You could login with `username: admin` and `password: pw`.

To configure Camunda Optimize have a look at the [docs](https://docs.camunda.io/docs/self-managed/optimize-deployment/setup/configuration/).

### ⚙️ Camunda Platform

Have a look at the running instance: [Camunda Platform](http://localhost:8080)

You could login with `username: admin` and `password: pw`.

If you want to know more about the micronaut camunda bpm integration have a look at [this Blog](https://camunda.com/blog/2021/07/automate-any-process-on-micronaut/).

### 🔨 Camunda Worker

Using the [external task pattern](https://docs.camunda.org/manual/7.16/user-guide/process-engine/external-tasks/) to work on a service task.

If you want to know more about the micronaut camunda external client integration have a look at [this GitHub Repo](https://github.com/camunda-community-hub/micronaut-camunda-external-client).

## 🚀Getting Started

Place the Camunda Optimize licenses under `licenses/OptimizeLicense.txt`.

### ☸️Kubernetes

```sh
kubectl create configmap optimize-licenses --from-file licenses/OptimizeLicense.txt
```

To pull the Camunda Optimize docker image you must be logged into the camunda registry.

E.g. with a pull secret:

```sh
kubectl create secret docker-registry camunda-registry \
        --docker-server=registry.camunda.cloud \
        --docker-username=<username> \
        --docker-password=<password> \
        --namespace=default
```

To start the kubernetes pods run `kubectl apply -f kubernetes/`.

### 🐳Docker

Start the containers with the docker-compose: `docker-compose up`
