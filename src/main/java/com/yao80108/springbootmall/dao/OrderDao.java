package com.yao80108.springbootmall.dao;

import com.yao80108.springbootmall.model.OrderItem;

import java.util.List;

public interface OrderDao {
    Integer createOrder(Integer userId, Integer totalAmount);
    void  createOrderItems(Integer orderId, List<OrderItem> orderItemList);
}
