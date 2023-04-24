package com.etiya.ecommercepair3.dataaccess.abstracts;

import com.etiya.ecommercepair3.entities.concrete.IndividualCustomer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IndividualCustomerDao extends JpaRepository<IndividualCustomer,Integer> {
}
