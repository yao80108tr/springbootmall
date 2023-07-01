package com.yao80108.springbootmall.service.impl;

import com.yao80108.springbootmall.dao.ProductDao;
import com.yao80108.springbootmall.dto.ProductQueryParams;
import com.yao80108.springbootmall.dto.ProductResquest;
import com.yao80108.springbootmall.model.Product;
import com.yao80108.springbootmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductDao productDao;

    @Override
    public List<Product> getProducts(ProductQueryParams productQueryParams) {
        return productDao.getProducts(productQueryParams);
    }

    @Override
    public Product getProductById(Integer productId) {
        return productDao.getProductById(productId);
    }

    @Override
    public Integer createProduct(ProductResquest productResquest) {
        return productDao.createProduct(productResquest);
    }

    @Override
    public void updateProduct(Integer productId, ProductResquest productResquest) {
        productDao.updateProduct(productId, productResquest);
    }

    @Override
    public void deleteProductById(Integer productId) {
        productDao.deleteProductById(productId);
    }

    @Override
    public Integer countProduct(ProductQueryParams productQueryParams) {
        return productDao.countProduct(productQueryParams);
    }
}
