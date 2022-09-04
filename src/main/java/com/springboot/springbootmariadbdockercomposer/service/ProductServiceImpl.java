package com.springboot.springbootmariadbdockercomposer.service;

import com.springboot.springbootmariadbdockercomposer.domain.Product;
import com.springboot.springbootmariadbdockercomposer.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> getAllProduct() {
        return productRepository.findAll();
    }

    @Override
    public Product getOneProduct(Long id) {
        Optional<Product> productOpt = productRepository.findById(id);
        return productOpt.orElseThrow(() -> new NoSuchElementException("No product found"));
    }

    @Override
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }

}
