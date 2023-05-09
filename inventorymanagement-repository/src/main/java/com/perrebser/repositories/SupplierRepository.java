package com.perrebser.repositories;

import com.perrebser.entities.SupplierEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierRepository extends JpaRepository<SupplierEntity,Long> {

}
