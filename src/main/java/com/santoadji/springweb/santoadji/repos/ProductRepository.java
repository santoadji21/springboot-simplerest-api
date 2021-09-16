package com.santoadji.springweb.santoadji.repos;

import com.santoadji.springweb.santoadji.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
