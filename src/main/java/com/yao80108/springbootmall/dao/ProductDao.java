package com.yao80108.springbootmall.dao;

import com.yao80108.springbootmall.dto.ProductResquest;
import com.yao80108.springbootmall.model.Product;

public interface ProductDao {
    Product getProductById(Integer productId);

    Integer createProduct(ProductResquest productResquest);
    void updateProduct(Integer productId, ProductResquest productResquest);
}
