package com.etiya.ecommercepair3.dataaccess.abstracts;

import com.etiya.ecommercepair3.entities.concrete.ProductDiscount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDiscountDao extends JpaRepository<ProductDiscount,Integer> {
}
