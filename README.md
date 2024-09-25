# JournalApp - Spring Boot Project

## Overview

**JournalApp** is a Spring Boot-based application that serves as a journaling platform. The project is developed using **Maven** for dependency management, and **VS Code** as the primary IDE. It features RESTful APIs, secured authentication, scheduling tasks, external API integration (including weather data), and more.

## Features

- **REST APIs**: Implemented RESTful services for journal management.
- **MongoDB Atlas**: Leveraged MongoDB Atlas for efficient cloud-based database management.
- **Spring Security**: Integrated **JWT-based authentication** for secure API access.
- **Lombok**: Simplified the development process with Lombok annotations to reduce boilerplate code.
- **Junit & Mockito**: Ensured code quality through comprehensive unit testing and mocking using JUnit and Mockito.
- **SonarQube & SonarCloud**: Integrated **SonarQube, SonarLint**, and **SonarCloud** for continuous code quality and security analysis.
- **External API Integration**: Integrated a **Weather API** to provide real-time weather data for journal entries.
- **Gmail SMTP**: Added email notification functionality via Gmail SMTP.
- **Task Scheduling**: Implemented scheduled tasks using Spring's scheduling framework for automated functionalities.
- **Sentiment Analysis**: Added sentiment analysis capabilities to analyze journal entries.
- **Redis Cloud**: Implemented Redis Cloud for efficient caching mechanisms.
- **Apache Kafka**: Integrated Apache Kafka for message streaming between services.

## Key Technologies & Tools

- **Spring Boot**: Core framework for building the application.
- **MongoDB Atlas**: Cloud-based NoSQL database.
- **Spring Security & JWT**: Securing the API endpoints with JSON Web Tokens.
- **Lombok**: Reducing boilerplate code.
- **Redis Cloud**: Caching with Redis.
- **Apache Kafka**: Message queuing system.
- **JUnit & Mockito**: Testing frameworks for unit and integration testing.
- **SonarQube & SonarCloud**: Continuous code quality analysis.
- **Postman**: Used for testing and verifying REST APIs.
- **Gmail SMTP**: Integrated email notifications via Gmail.
- **Weather API**: Integrated an external API to fetch real-time weather data for journal entries.
- **Scheduling Tasks**: Automated background tasks using Spring scheduling.

## Installation & Setup

1. Clone the repository:

   ```bash
   git clone https://github.com/yourusername/JournalApp_SpringBoot_Project.git
   cd JournalApp_SpringBoot_Project
   ```

## Set up the database:

- Create a MongoDB Atlas cluster and configure the connection URI in `application.properties`.

## Configure external APIs:

- Set up the **Weather API** key in `application.properties` to integrate weather data.
- Configure **Gmail SMTP** settings for email notifications.

## Build and run the project:

````bash
mvn clean install
mvn spring-boot:run

- Access the API at `http://localhost:8080`.

## API Testing

- **Postman** was used to test and validate the REST APIs. You can import the provided Postman collection to test the APIs:
  - Include endpoints for journal management, authentication, weather integration, etc.
  - Ensure the **JWT token** is used for authentication in Postman.

## Testing

- Run unit and integration tests using:

```bash
mvn test


## Security

- **JWT-based authentication** is implemented for secure access to the API endpoints.
- User authentication and role-based authorization using **Spring Security**.
````
