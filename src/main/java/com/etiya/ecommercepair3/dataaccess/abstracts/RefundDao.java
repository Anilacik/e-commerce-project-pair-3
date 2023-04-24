package com.etiya.ecommercepair3.dataaccess.abstracts;

import com.etiya.ecommercepair3.entities.concrete.Refund;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RefundDao extends JpaRepository<Refund,Integer> {
}
