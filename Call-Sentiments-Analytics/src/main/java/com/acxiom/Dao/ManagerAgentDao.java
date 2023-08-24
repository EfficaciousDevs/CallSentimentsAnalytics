package com.acxiom.Dao;

import com.acxiom.entity.ManagerAgentTable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ManagerAgentDao extends CrudRepository<ManagerAgentTable,Integer> {
    ManagerAgentTable findByAgentId(int agentId);
}
