# Backend Application for CI/CD GitOps Project

A simple Spring Boot application that serves as the backend for demonstrating CI/CD with GitOps principles using Jenkins, Docker, Nexus, Kubernetes, and ArgoCD.

## Endpoints

- `/hello` - Returns a greeting message
- `/health` - Health check endpoint
- `/info` - Application information

## Built With

- Java 17
- Spring Boot 3.2.0
- Maven
- Docker

## CI/CD Pipeline

This application is built and deployed using:
- Jenkins for CI/CD pipeline
- Docker for containerization
- Nexus as Docker registry
- Kubernetes for container orchestration
- ArgoCD for GitOps deployment
