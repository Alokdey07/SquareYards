package com.squareyards.service.serviceImpl;

import com.squareyards.entity.LegalProduct;
import com.squareyards.repository.LegalProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LegalProductService {

    @Autowired
    private LegalProductRepository legalProductRepository;

    public List<LegalProduct> getAllLegalProducts() {
        return legalProductRepository.findAll();
    }

    public LegalProduct getLegalProductById(Long id) {
        return legalProductRepository.findById(id).orElse(null);
    }
}