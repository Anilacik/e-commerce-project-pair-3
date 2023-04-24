package com.etiya.ecommercepair3.dataaccess.abstracts;

import com.etiya.ecommercepair3.entities.concrete.CorparateCustomer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CorparateCustomerDao extends JpaRepository<CorparateCustomer,Integer> {
}
