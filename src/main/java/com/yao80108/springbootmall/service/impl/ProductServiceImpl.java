package com.yao80108.springbootmall.service.impl;

import com.yao80108.springbootmall.dao.ProductDao;
import com.yao80108.springbootmall.dto.ProductResquest;
import com.yao80108.springbootmall.model.Product;
import com.yao80108.springbootmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductDao porductDao;
    @Override
    public Product getProductById(Integer productId) {
        return porductDao.getProductById(productId);
    }

    @Override
    public Integer createProduct(ProductResquest productResquest) {
        return porductDao.createProduct(productResquest);
    }
}
