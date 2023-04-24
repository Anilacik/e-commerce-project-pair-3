package com.etiya.ecommercepair3.dataaccess.abstracts;

import com.etiya.ecommercepair3.entities.concrete.SizeType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SizeTypeDao extends JpaRepository<SizeType,Integer> {
}
