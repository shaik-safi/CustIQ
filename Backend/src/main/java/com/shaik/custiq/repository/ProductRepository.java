package com.shaik.custiq.repository;

import com.shaik.custiq.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}