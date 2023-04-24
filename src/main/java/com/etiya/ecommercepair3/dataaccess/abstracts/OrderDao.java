package com.etiya.ecommercepair3.dataaccess.abstracts;

import com.etiya.ecommercepair3.entities.concrete.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDao extends JpaRepository<Order,Integer> {
}
