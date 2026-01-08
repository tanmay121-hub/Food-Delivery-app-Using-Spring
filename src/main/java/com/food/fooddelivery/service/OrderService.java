package com.food.fooddelivery.service;

import com.food.fooddelivery.model.DeliveryPartner;
import com.food.fooddelivery.model.Order;
import com.food.fooddelivery.model.Restaurant;
import com.food.fooddelivery.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private RestaurantService restaurantService;
    @Autowired
    private DeliveryService deliveryService;

    public void processOrder(){
        orderRepository.saveOrder();
        restaurantService.prepareFood();
        deliveryService.deliverOrder();
    }
}
