package com.acxiom.Dao;

import com.acxiom.entity.DefaultAnalysis;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DefaultAnalysisDao extends CrudRepository<DefaultAnalysis,String> {
    DefaultAnalysis findByCallId(String agentId);
}
