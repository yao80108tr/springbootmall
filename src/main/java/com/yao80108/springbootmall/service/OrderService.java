package com.yao80108.springbootmall.service;

import com.yao80108.springbootmall.dto.CreateOrderRequest;
import com.yao80108.springbootmall.dto.OrderQueryParams;
import com.yao80108.springbootmall.model.Order;

import java.util.List;

public interface OrderService {
    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);

    Order getOrderById(Integer orderId);
    Integer countOrder(OrderQueryParams orderQueryParams);
    List<Order> getOrders(OrderQueryParams orderQueryParams);
}
