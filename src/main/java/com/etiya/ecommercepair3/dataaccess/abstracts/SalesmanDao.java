package com.etiya.ecommercepair3.dataaccess.abstracts;

import com.etiya.ecommercepair3.entities.concrete.Salesman;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalesmanDao extends JpaRepository<Salesman,Integer> {
}
