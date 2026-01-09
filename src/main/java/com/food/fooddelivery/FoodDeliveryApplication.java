package com.food.fooddelivery;

import com.food.fooddelivery.config.AppConfig;
import com.food.fooddelivery.controller.OrderController;
import com.food.fooddelivery.dao.InventoryDao;
import com.food.fooddelivery.model.Inventory;
import com.food.fooddelivery.model.Order;
import com.food.fooddelivery.model.Restaurant;
import com.food.fooddelivery.service.DeliveryService;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@SpringBootApplication
public class FoodDeliveryApplication {

    public static void main(String[] args) throws SQLException {

//        Connection connection = DriverManager.getConnection("JDBC:mysql://localhost:3306/foodapp","root","pass");
//        PreparedStatement ps = connection.prepareStatement("INSERT INTO foodapp");
//        connection.prepareStatement("fetch time ");
//        ps.setInt(1,12);
//        ps.execute();
//        ps.close();
//        connection.close();


        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        JdbcTemplate jdbcTemplate = ctx.getBean(JdbcTemplate.class);
        Inventory inventory = new Inventory(1,"Pizza");
        InventoryDao inventoryDao = new InventoryDao(jdbcTemplate);
        inventoryDao.save(inventory);
        inventoryDao.findPage(1,2);
        System.out.println(inventoryDao.findAll());


//
//        OrderController orderController = ctx.getBean(OrderController.class);
//        orderController.placeOrder();
//        //for Restaurant
//        Restaurant restaurant = ctx.getBean(Restaurant.class);
//
//
//
//        //for Order
//        Order order = ctx.getBean(Order.class);
//
//
//
//
//        //for DeliveryService
//        DeliveryService deliveryService = ctx.getBean(DeliveryService.class);
    }
}
