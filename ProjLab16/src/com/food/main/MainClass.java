/*
 Problem Statement
You are tasked with building a simple Spring-based Food Delivery System for a food ordering platform. The system should manage customers, restaurants, and support different delivery methods such as bike and car. The architecture must use Spring annotations like @Component, @Autowired, @Qualifier, and @ComponentScan. Configuration should be done using Java-based configuration, not XML.

Requirements
Your application should consist of the following components:
1. Delivery Mechanism (Interface + Implementations)
Interface:
public interface DeliveryService {
    void deliverOrder(String address);
}

Implementations:
Create two sub class of BikeDeliveryService and  CarDeliveryService.
Override dekiverOrder in both class and write below logic.
BikeDeliveryService – prints: "Delivering by bike to <address>"
CarDeliveryService – prints: "Delivering by car to <address>"

Use @Component("bikeDelivery") and @Component("carDelivery") to distinguish them.

2. Model Classes
a. class Customer: Represents a customer.
Fields:
name (String)
address (String)
Include a constructor and getter methods.

b. class Restaurant : Represents a restaurant.
Fields:
name (String)
cuisine (String)
Include a constructor and getter methods.

3. Repository Layer
These classes simulate fetching data from a database. Use @Component.

a. class CustomerRepository
Method:
Customer getCustomerById(int id) → returns dummy customer like:
new Customer("Uttam Singh Rathod", "Manjeera building, Ameerpet")

b. class  RestaurantRepository
Method:
Restaurant getRestaurantById(int id) → returns dummy restaurant like:
new Restaurant("Pizza Place", "Italian")

4. Service Layer
class OrderService
Responsible for processing the order.
Injects:
CustomerRepository
RestaurantRepository
DeliveryService (use @Qualifier("bikeDelivery") for now)

Method:
void placeOrder(int customerId, int restaurantId)
This method should:
Fetch the customer and restaurant by ID
Print:
"Placing order from <Restaurant Name> for customer <Customer Name>"

Call deliverOrder(<customer address>)

5. Configuration Class
Use a class named AppConfig:
Annotate with @Configuration
Use @ComponentScan(basePackages = "com.fooddelivery")

6. Main Class
The entry point of the application.
Load the Spring context via AnnotationConfigApplicationContext
Retrieve the OrderService bean
Call placeOrder(1, 101)

Output Example
Placing order from Pizza Place for customer Uttam Singh Rathod
Delivering by bike to Manjeera building, Ameerpet.
 */

package com.food.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.food.config.AppConfig;
import com.food.service.OrderService;

public class MainClass {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		OrderService service = ctx.getBean(OrderService.class);
		service.placeOrder(1, 101);
		
		ctx.close();
	}
}
