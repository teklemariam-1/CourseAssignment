package edu.mum.cs.cs425.demowebapps.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.mum.cs.cs425.demowebapps.product.model.Product;

@Repository("productRepository")
public interface ProductRepository extends JpaRepository<Product, Long> {
}
