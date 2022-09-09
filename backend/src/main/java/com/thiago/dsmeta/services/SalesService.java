package com.thiago.dsmeta.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thiago.dsmeta.entities.Sale;
import com.thiago.dsmeta.repositories.SaleRepository;

@Service
public class SalesService {

	@Autowired
	private SaleRepository repository;
	public List<Sale> findSales() {
		return repository.findAll();
	}
}
