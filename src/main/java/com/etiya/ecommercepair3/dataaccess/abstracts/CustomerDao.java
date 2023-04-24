package com.etiya.ecommercepair3.dataaccess.abstracts;

import com.etiya.ecommercepair3.entities.concrete.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerDao extends JpaRepository<Customer,Integer> {
}
