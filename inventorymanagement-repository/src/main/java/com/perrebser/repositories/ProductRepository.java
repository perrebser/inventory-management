package com.perrebser.repositories;

import com.perrebser.entities.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ProductRepository extends JpaRepository<ProductEntity,String> {
    Optional<ProductEntity> findByCodeIgnoreCase(String code);

    void delete(ProductEntity product);

}
