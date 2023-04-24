package com.etiya.ecommercepair3.dataaccess.abstracts;

import com.etiya.ecommercepair3.entities.concrete.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentDao extends JpaRepository<Payment,Integer> {
}
