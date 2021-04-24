package com.uplus.scorderservice.service;


import com.uplus.scorderservice.dto.OrderDto;
import com.uplus.scorderservice.jpa.OrderEntity;

public interface OrderService {

    OrderDto createOrder(OrderDto orderDetails);

    OrderDto getOrderByOrderId(String orderId);

    Iterable<OrderEntity> getOrdersByUserId(String userId);

}