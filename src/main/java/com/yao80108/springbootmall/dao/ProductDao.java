package com.yao80108.springbootmall.dao;

import com.yao80108.springbootmall.model.Product;

public interface ProductDao {
    Product getProductById(Integer productId);
}
