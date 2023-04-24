package com.etiya.ecommercepair3.dataaccess.abstracts;

import com.etiya.ecommercepair3.entities.concrete.ColorType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ColorTypeDao extends JpaRepository<ColorType,Integer> {
}
