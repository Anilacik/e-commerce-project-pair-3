package com.etiya.ecommercepair3.dataaccess.abstracts;

import com.etiya.ecommercepair3.entities.concrete.GenderType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenderTypeDao extends JpaRepository<GenderType,Integer> {
}
