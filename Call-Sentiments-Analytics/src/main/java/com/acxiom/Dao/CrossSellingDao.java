package com.acxiom.Dao;

import com.acxiom.entity.CrossSelling;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CrossSellingDao extends CrudRepository<CrossSelling, Integer> {
}
