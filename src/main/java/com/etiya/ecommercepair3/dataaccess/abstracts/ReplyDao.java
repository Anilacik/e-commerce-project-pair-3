package com.etiya.ecommercepair3.dataaccess.abstracts;

import com.etiya.ecommercepair3.entities.concrete.Reply;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReplyDao extends JpaRepository<Reply,Integer> {
}
