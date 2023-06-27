package com.yao80108.springbootmall.service;

import com.yao80108.springbootmall.dto.ProductResquest;
import com.yao80108.springbootmall.model.Product;

public interface ProductService {
    Product getProductById(Integer productId);
    Integer createProduct(ProductResquest productResquest);
    void updateProduct(Integer productId, ProductResquest productResquest);
    void deleteProductById(Integer productId);
}
