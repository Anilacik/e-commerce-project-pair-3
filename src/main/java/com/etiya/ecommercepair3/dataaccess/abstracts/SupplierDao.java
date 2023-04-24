package com.etiya.ecommercepair3.dataaccess.abstracts;

import com.etiya.ecommercepair3.entities.concrete.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierDao extends JpaRepository<Supplier,Integer> {
}
