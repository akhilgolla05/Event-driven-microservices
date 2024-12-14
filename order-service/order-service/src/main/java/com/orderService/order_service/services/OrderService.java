package com.orderService.order_service.services;

import com.orderService.order_service.models.OrderDetail;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class OrderService {

    public OrderDetail createOrder() {
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setOrderId(UUID.randomUUID().toString());
        orderDetail.setEmail("munna@gmail.com");
        orderDetail.setPhone("123456789");
        orderDetail.setUserId("345678");
        orderDetail.setCourseId(UUID.randomUUID().toString());

        //save DB
        return orderDetail;
    }
}
