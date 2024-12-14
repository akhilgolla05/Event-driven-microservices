package com.notificationService.notification.functions;

import com.notificationService.notification.dto.OrderInformation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Function;
import java.util.function.Supplier;

@Configuration
public class NotificationService {

    //localhost:8080/testing
    @Bean
    public Supplier<String> testing(){
        return ()-> "testing!";
    }

    @Bean
    public Function<String, String> testing1(){
        return (message)-> "testing "+ message;
    }

    @Bean
    public Function<OrderInformation, String> orderNotification() {
        return null;
    }

    private void sendNotification(OrderInformation orderInformation) {
    }
}
