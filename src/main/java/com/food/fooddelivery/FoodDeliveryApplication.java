package com.food.fooddelivery;

import com.food.fooddelivery.config.AppConfig;
import com.food.fooddelivery.controller.OrderController;
import com.food.fooddelivery.model.Order;
import com.food.fooddelivery.model.Restaurant;
import com.food.fooddelivery.service.DeliveryService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class FoodDeliveryApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        OrderController orderController = ctx.getBean(OrderController.class);
        orderController.placeOrder();
        //for Restaurant
        Restaurant restaurant = ctx.getBean(Restaurant.class);



        //for Order
        Order order = ctx.getBean(Order.class);





        //for DeliveryService
        DeliveryService deliveryService = ctx.getBean(DeliveryService.class);
    }
}
