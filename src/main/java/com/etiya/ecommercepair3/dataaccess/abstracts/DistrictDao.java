package com.etiya.ecommercepair3.dataaccess.abstracts;

import com.etiya.ecommercepair3.entities.concrete.District;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DistrictDao extends JpaRepository<District,Integer> {
}
