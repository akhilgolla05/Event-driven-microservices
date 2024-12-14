package com.orderService.order_service.function;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Consumer;

@Configuration
public class NotifyAck {

    @Bean
    public Consumer<String> notificationAck(){
        //update the status logic here
        return System.out::println;
    }
}
