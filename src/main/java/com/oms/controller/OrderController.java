package com.oms.controller;

import com.oms.models.Order;
import com.oms.repos.OrderRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class OrderController {

    OrderRepository orderRepository;

    public OrderController(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @PostMapping("/create-multiple-order")
    public ResponseEntity<List<Order>> createMultipleOrders(@RequestBody List<Order> orders) {
        List<Order> savedOrders = orderRepository.saveAll(orders);
        return new ResponseEntity<>(savedOrders, HttpStatus.CREATED);
    }

    @PostMapping("/generate-random-orders")
    public ResponseEntity<List<Order>> generateRandomOrders(@RequestParam int n) {
        List<Order> randomOrders = new ArrayList<>();
        for(int i=0; i<n;i++){
            Order order = new Order("comment# " + i, "ipid #" + i);
            randomOrders.add(order);
        }
        List<Order> savedOrders = orderRepository.saveAll(randomOrders);
        return new ResponseEntity<>(savedOrders, HttpStatus.CREATED);
    }

    @GetMapping("/info")
    public String greet() {
        return "Welcome to order controller. ";
    }
}
