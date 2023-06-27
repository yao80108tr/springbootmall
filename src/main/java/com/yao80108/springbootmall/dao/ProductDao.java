package com.yao80108.springbootmall.dao;

import com.yao80108.springbootmall.dto.ProductResquest;
import com.yao80108.springbootmall.model.Product;

import java.util.List;

public interface ProductDao {
    List<Product> getProducts();
    Product getProductById(Integer productId);
    Integer createProduct(ProductResquest productResquest);
    void updateProduct(Integer productId, ProductResquest productResquest);
    void deleteProductById(Integer productId);
}
