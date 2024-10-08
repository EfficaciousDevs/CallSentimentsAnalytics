package com.acxiom.Dao;

import com.acxiom.entity.AgentPerformanceComments;
import com.acxiom.entity.DefaultAnalysis;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AgentPerformanceCommentsDao extends CrudRepository<AgentPerformanceComments,Integer> {
    List<AgentPerformanceComments> findByAgentId(Integer agentId);
}


