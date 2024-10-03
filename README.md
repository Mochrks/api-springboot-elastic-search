<h1 align="center">Spring Boot CRUD API - Elasticsearch Integration</h1>

<p align="center">
  <img src="https://img.shields.io/badge/SpringBoot-2.5.4-brightgreen" alt="Spring Boot Version" />
  <img src="https://img.shields.io/badge/Elastic Search-Integrated-blue" alt="Elastic Integration" />
  <img src="https://img.shields.io/badge/PostgreSQL-Database-blue" alt="PostgreSQL Integration" />
</p>

<p align="center">
  <img src="https://skillicons.dev/icons?i=spring,postgres,elasticsearch" alt="Tech Stack Icons" />
</p>




## Overview

This is a **CRUD API** built with **Spring Boot** that integrates **Elasticsearch** for full-text search and indexing. The API allows creating, reading, updating, and deleting records while leveraging Elasticsearch to enhance search performance across the dataset. Elasticsearch is used as the primary search engine, making it efficient to perform fast searches and text analysis.

## Features

- CRUD Operations with Elasticsearch for full-text search capabilities
- Integration with **Elasticsearch** for efficient data retrieval
- RESTful API design with clean architecture
- **Spring Data Elasticsearch** for indexing and search operations
- Input validation and error handling
- **Swagger UI** for API documentation and testing

## Tech Stack

- **Spring Boot 2.5.4**
- **Elasticsearch** for full-text search and indexing
- **Spring Data Elasticsearch** for interaction with Elasticsearch
- **Lombok** for reducing boilerplate code
- **Swagger** for API documentation

## Project Structure

```bash
api-springboot-elastic-search/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/springboot_elastic/  # Source code and main application
│   ├── resources/
│   │   ├── application.properties       # Configuration for Elasticsearch
│   └── test/
│       └── java/                        # Unit tests for services and controllers
└── pom.xml                              # Project dependencies
```

## Setup & Installation
--------------------

-   **Clone the repository**

    ```bash
    git clone https://github.com/mochrks/api-springboot-elastic-search.git
    cd api-springboot-elastic-search
    ```

-   **Install dependencies**

    ```bash
    mvn clean install
    ```

-   **Set up Elasticsearch**

    -   Ensure **Elasticsearch** is running locally or provide your connection details in `application.properties`.
    -   Update the following properties in `src/main/resources/application.properties`:


    ```properties
    spring.elasticsearch.rest.uris=http://localhost:9200
    ```

-   **Run the application**

    ```bash
    mvn spring-boot:run
    ```

-   The application will be running on `http://localhost:8080`.

-   
## Connect with me:
[![GitHub](https://img.shields.io/badge/GitHub-333?style=for-the-badge&logo=github&logoColor=white)](https://github.com/mochrks)
[![YouTube](https://img.shields.io/badge/YouTube-FF0000?style=for-the-badge&logo=youtube&logoColor=white)](https://youtube.com/@Gdvisuel)
[![Instagram](https://img.shields.io/badge/Instagram-E4405F?style=for-the-badge&logo=instagram&logoColor=white)](https://instagram.com/mochrks)
[![LinkedIn](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://linkedin.com/in/mochrks)
[![Behance](https://img.shields.io/badge/Behance-1769FF?style=for-the-badge&logo=behance&logoColor=white)](https://behance.net/mochrks)
[![Dribbble](https://img.shields.io/badge/Dribbble-EA4C89?style=for-the-badge&logo=dribbble&logoColor=white)](https://dribbble.com/mochrks)
