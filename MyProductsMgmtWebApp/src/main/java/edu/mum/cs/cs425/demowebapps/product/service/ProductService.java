package edu.mum.cs.cs425.demowebapps.product.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.mum.cs.cs425.demowebapps.product.model.Product;
import edu.mum.cs.cs425.demowebapps.product.repository.ProductRepository;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Iterable<Product> getProducts() {
        return productRepository.findAll();
    }

    
	public Product save(Product book) {
		return productRepository.save(book);
	}

	
	public Product findOne(Long id) {
		return productRepository.getOne(id);
	}

	
	public void delete(Long id) {
		productRepository.deleteById(id);
	}
}
