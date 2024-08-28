package com.acxiom.Dao;

import com.acxiom.entity.CategoryWiseCommonProblems;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryWiseCommonProblemsDao extends CrudRepository<CategoryWiseCommonProblems, Integer> {
}
