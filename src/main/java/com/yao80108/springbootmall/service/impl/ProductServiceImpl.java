package com.yao80108.springbootmall.service.impl;

import com.yao80108.springbootmall.constant.ProductCategory;
import com.yao80108.springbootmall.dao.ProductDao;
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
    public List<Product> getProducts(ProductCategory category, String search) {
        return productDao.getProducts(category, search);
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
}
