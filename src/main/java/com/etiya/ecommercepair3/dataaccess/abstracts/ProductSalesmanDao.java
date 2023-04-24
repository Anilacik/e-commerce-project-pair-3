package com.etiya.ecommercepair3.dataaccess.abstracts;

import com.etiya.ecommercepair3.entities.concrete.ProductSalesman;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductSalesmanDao extends JpaRepository<ProductSalesman,Integer> {
}
