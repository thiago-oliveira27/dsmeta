package com.thiago.dsmeta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thiago.dsmeta.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}
