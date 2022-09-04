package com.springboot.springbootmariadbdockercomposer.repository;

import com.springboot.springbootmariadbdockercomposer.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}