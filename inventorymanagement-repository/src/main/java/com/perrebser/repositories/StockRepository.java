package com.perrebser.repositories;

import com.perrebser.entities.StockEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockRepository extends JpaRepository<StockEntity,Long> {
}
