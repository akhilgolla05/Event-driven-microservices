package com.orderService.order_service.models;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class OrderDetail {

    private String orderId;;
    private String userId;
    private String email;
    private String phone;
    private boolean orderStatus = false;
    private boolean orderPaymentStatus = false;
    private String courseId;

    public String getOrderId() {
        return orderId;
    }

    public String getUserId() {
        return userId;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public boolean isOrderStatus() {
        return orderStatus;
    }

    public boolean isOrderPaymentStatus() {
        return orderPaymentStatus;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setOrderStatus(boolean orderStatus) {
        this.orderStatus = orderStatus;
    }

    public void setOrderPaymentStatus(boolean orderPaymentStatus) {
        this.orderPaymentStatus = orderPaymentStatus;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }
}
