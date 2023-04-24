package com.etiya.ecommercepair3.dataaccess.abstracts;

import com.etiya.ecommercepair3.entities.concrete.Street;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StreetDao extends JpaRepository<Street,Integer> {
}
