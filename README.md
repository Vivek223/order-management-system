# order-management-system
Sample project to mimic Equity Order Management System 

Objectives 
	- Create a microservice using Java 17, Spring Boot and Spring Kafka as dependencies

How to run the project:
1) Build the project and run
2) It uses embeded H2 database. http://localhost:8081/h2-console/ (user=sa, password blank)

3) Postman URLs
GET http://localhost:8081/info 
POST http://localhost:8081/create-multiple-order
Raw, JSON
   [
   {
   "orderId": 3,
   "ipid": "ip1",
   "comment": "cm1"
   },
   {
   "orderId": 4,
   "ipid": "cm101",
   "comment": "ip101"
   },
   {
   "orderId": 5,
   "ipid": "cm105",
   "comment": "ip105"
   }
]

POST http://localhost:8081/generate-random-orders?n=50
query param -> n value = 50

