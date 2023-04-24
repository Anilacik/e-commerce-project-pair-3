package com.etiya.ecommercepair3.dataaccess.abstracts;

import com.etiya.ecommercepair3.entities.concrete.ProductCart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductCartDao extends JpaRepository<ProductCart,Integer> {
}
