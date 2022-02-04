# Optimize Demo

Camunda Demo with an example Process running in the [Camunda Platform](https://docs.camunda.org/manual/7.16/), which is connected to [Camunda Optimize](https://docs.camunda.io/docs/components/optimize/what-is-optimize/).

## Table of Contents <!-- omit in toc -->

- [Optimize Demo](#optimize-demo)
  - [✨Features](#features)
    - [🗺 Optimize](#-optimize)
    - [⚙️ Camunda Platform](#️-camunda-platform)
  - [🚀Getting Started](#getting-started)
    - [☸️Kubernetes](#️kubernetes)
    - [🐳Docker](#docker)

## ✨Features

### 🗺 Optimize

Have a look: [Camunda Optimize](http://localhost:8090)

You could login with `username: admin` and `password: pw`.

### ⚙️ Camunda Platform

Have a look: [Camunda Platform](http://localhost:7777)

You could login with `username: admin` and `password: pw`.

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
