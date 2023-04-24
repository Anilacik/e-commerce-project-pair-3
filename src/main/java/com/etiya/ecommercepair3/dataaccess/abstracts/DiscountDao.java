package com.etiya.ecommercepair3.dataaccess.abstracts;

import com.etiya.ecommercepair3.entities.concrete.Discount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DiscountDao extends JpaRepository<Discount,Integer> {
}
