package com.squareyards.repository;

import com.squareyards.entity.LegalProduct;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LegalProductRepository extends JpaRepository<LegalProduct, Long> {
}