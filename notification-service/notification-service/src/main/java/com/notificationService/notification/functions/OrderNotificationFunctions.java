package com.notificationService.notification.functions;

import com.notificationService.notification.dto.OrderDetail;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Function;

@Configuration
public class OrderNotificationFunctions {

    @Bean
    public Function<OrderDetail,String> orderEventReceiver() {
        return orderDetail ->{

            sendEmailToUser(orderDetail.getEmail(), orderDetail.getPhone());

            //this string will be returned automatically as ack, no need of StreamBinder
            return "Notification Send to User!";
        };
    }

    private void sendEmailToUser(String email, String phone) {
        System.out.println("sending email to user "+email);
    }
}
