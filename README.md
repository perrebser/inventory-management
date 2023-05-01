# Inventory Management
This project is a basic backend application that provides CRUD operations for managing an inventory. It's built with Spring 2.7 and Java 17, and uses Swagger UI and OpenAPI to document the APIs.
## Prerequisites
Before getting started, make sure you have the following components installed:
* Java 17
* Maven 3.8.3
* Docker
## Setup
To run the application, follow these steps:

Clone the repository.

Open a terminal in the root directory of the project.

Set up db:
 
`docker compose up -d`

Generate files:

`mvn clean install -DskipTests`

Generate files & Run tests

`mvn clean install`

Then run either from command line

    mvn spring-boot:run

Or from IntelliJ (`com.perrebser.Application`)

## API Documentation
The API documentation is automatically generated using Swagger UI and OpenAPI. You can access it at http://localhost:8092/swagger-ui.html.

API Endpoints
The API provides the following endpoints for managing the entities in the database:

* GET /categories: Gets all categories.
* GET /categories/{id}: Gets a category by ID.
* POST /categories: Creates a new category.
* PUT /categories/{id}: Updates an existing category.
* DELETE /categories/{id}: Deletes a category by ID.
* GET /products: Gets all products.
* GET /products/{id}: Gets a product by ID.
* POST /products: Creates a new product.
* PUT /products/{id}: Updates an existing product.
* DELETE /products/{id}: Deletes a product by ID.
* GET /suppliers: Gets all suppliers.
* GET /suppliers/{id}: Gets a supplier by ID.
* POST /suppliers: Creates a new supplier.
* PUT /suppliers/{id}: Updates an existing supplier.
* DELETE /suppliers/{id}: Deletes a supplier by ID.
* GET /stock: Gets all stock.
* GET /stock/{id}: Gets the stock of a product by ID.
* POST /stock: Adds a quantity of stock to a product.
* PUT /stock/{id}: Updates the stock quantity of a product.
* DELETE /stock/{id}: Deletes all stock of a product.