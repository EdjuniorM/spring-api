# User Management API

A User Management API for handling user operations in a web application. This API allows for operations such as creating, retrieving, updating, and deleting user profiles.

## Features

- Create new user profiles
- Retrieve existing user profiles
- Update user information
- Delete users from the system
- Integration with external microservices for extended functionalities

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

- **Independent of Database**: You can swap out Oracle or SQL Server for Mongo, BigTable, CouchDB, or something else. Your business rules are not bound to the database.
- **Independent of any external agency**: In fact, your business rules simply don’t know anything at all about the outside world.

The separation of concerns is achieved by encapsulating the business logic in independent modules that interact with each other through well-defined interfaces. Our project is organized into the following main layers:

- **Entities**: Contains enterprise-wide business rules.
- **Services**: Encapsulate all the business rules for a specific application.
- **Interface Adapters**: Convert data between the most convenient format for use cases and entities, and the format most convenient for some external agency such as the database or the web.
- **Frameworks and Drivers**: Contains details like the database, UI, and other tools that are used to make the application work.

We've also applied various design patterns such as Repository for data access, Service Layer for business logic, and DTOs for data transfer across layers.

## Prerequisites

Before you begin, ensure you have met the following requirements:

- Java 11 or higher
- Maven
- Your favorite IDE (e.g., IntelliJ IDEA, Eclipse)