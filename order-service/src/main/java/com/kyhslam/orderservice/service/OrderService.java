package com.kyhslam.orderservice.service;

import com.kyhslam.orderservice.dto.OrderDto;
import com.kyhslam.orderservice.jpa.OrderEntity;

public interface OrderService {
    OrderDto createOrder(OrderDto orderDetails);

    OrderDto getOrderByOrderId(String orderId);

    Iterable<OrderEntity> getOrdersByUserId(String userId);
}
