# order-management-system
Sample project to mimic Equity Order Management System 

Objectives 
	- Create a microservice using Java 17, Spring Boot and Spring Kafka as dependencies


Rest Controllers:

HTTP Post : http://localhost:8080/create-multiple-order
Postman >> Body >> Raw >> JSON 
Sample JSON Request

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
