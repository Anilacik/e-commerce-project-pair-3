package com.etiya.ecommercepair3.dataaccess.abstracts;

import com.etiya.ecommercepair3.entities.concrete.PaymentType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentTypeDao extends JpaRepository<PaymentType,Integer> {
}
