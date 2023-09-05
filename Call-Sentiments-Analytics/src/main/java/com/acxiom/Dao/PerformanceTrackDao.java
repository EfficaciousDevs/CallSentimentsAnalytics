package com.acxiom.Dao;

import com.acxiom.entity.PerformanceTrack;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PerformanceTrackDao extends CrudRepository<PerformanceTrack,Integer> {

    PerformanceTrack findByAgentId(int agentId);
}
