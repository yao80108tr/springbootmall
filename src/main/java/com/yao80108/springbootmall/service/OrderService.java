package com.yao80108.springbootmall.service;

import com.yao80108.springbootmall.dto.CreateOrderRequest;
import com.yao80108.springbootmall.model.Order;

public interface OrderService {
    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);

    Order getOrderById(Integer orderId);
}
