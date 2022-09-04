package com.springboot.springbootmariadbdockercomposer.service;

import com.springboot.springbootmariadbdockercomposer.domain.Product;

import java.util.List;

public interface ProductService {

    List<Product> getAllProduct();
    Product getOneProduct(Long id);
    Product createProduct(Product product);
    void deleteProduct(Long id);

}
