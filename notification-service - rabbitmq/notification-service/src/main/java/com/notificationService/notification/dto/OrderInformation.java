package com.notificationService.notification.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrderInformation {

    private String orderId;

    private String createdDate;

    private String price;

    private String email;

    private String userPhone;
}
