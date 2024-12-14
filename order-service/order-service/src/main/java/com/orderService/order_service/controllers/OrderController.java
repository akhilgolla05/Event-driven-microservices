package com.orderService.order_service.controllers;

import com.orderService.order_service.models.OrderDetail;
import com.orderService.order_service.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    private OrderService orderService;;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping
    public ResponseEntity<?> createOrder(){
        OrderDetail createdOrderDetail = orderService.createOrder();

        //send details to notification-service
        orderCreatedNotification(createdOrderDetail);
        return ResponseEntity.ok("Order Created!");
    }

    @Autowired
    private StreamBridge streamBridge;

    private void orderCreatedNotification(OrderDetail orderDetail) {

        boolean result = streamBridge.send("orderCreatedEvent-out-0", orderDetail);
        System.out.println("response : "+ result);
        if(result) {
            System.out.println("Event Triggered!");
        }else{
            System.out.println("Event Not Triggered!");
        }
    }
}
