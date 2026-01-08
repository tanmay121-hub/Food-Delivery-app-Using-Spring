package com.food.fooddelivery.controller;

import com.food.fooddelivery.model.DeliveryPartner;
import com.food.fooddelivery.model.Order;
import com.food.fooddelivery.model.Restaurant;
import com.food.fooddelivery.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class OrderController {

    @Autowired
    private OrderService orderService;

    public void placeOrder(){
    }

}
