package com.example.productservice.service;

import com.example.productservice.model.Product;
import com.example.productservice.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class InsertProductService {

    private final ProductRepository productRepository;

    public Product insertProduct(ProductDTO productDTO) {
        return productRepository.save(Product.from(productDTO));
    }
}