# Self Assessment Test App - Backend


This repository contains the backend implementation for the Self Assessment Test App. This backend service is responsible for extracting questions from Avien Cloud based on the test name, sending emails using an SMTP server, and deploying the application using Kubernetes and Docker.


## Features


#### Question Extraction: Retrieves questions from Avien Cloud storage based on the specified test name.
#### Email Sender Service: Implements an SMTP server to send emails.
#### Containerization: Dockerfile for building the backend service image.
#### Kubernetes Deployment: YAML files for deploying the service on a Kubernetes cluster.


## Getting Started

### Prerequisites

SpringBoot BackEnd Code 

Docker

Kubernetes

SMTP server credentials

Avien Cloud account and credentials


### Installation

#### Clone the repository:


git clone [https://github.com/somshivgupta/SPE_BackEnd.git]

cd self-assessment-test-app-backend


## Configuration


### Environment Variables

Create a .env file in the root directory of the project and add the following variables:


AVIEN_CLOUD_URL=jdbc:mysql://avnadmin:AVNS_kQdTw90A2qOTdVbgh3n@mysql-spemajor-spemajor.l.aivencloud.com:12264/test

SMTP_SERVER=smtp.gmail.com

SMTP_PORT=587

EMAIL_USER=dubeyashutosh310@gmail.com

EMAIL_PASS=hdgaqtaxaodbkopv


### Kubernetes Config


deployment.yaml: Contains the deployment configuration for Kubernetes.

service.yaml: Contains the service configuration for Kubernetes.


## Kubernetes Deployment

To deploy the application on a Kubernetes cluster:


### Apply the deployment configuration:

kubectl apply -f deployment.yaml


### Apply the service configuration:

kubectl apply -f service.yaml


### Verify the deployment:

kubectl get pods

kubectl get services
