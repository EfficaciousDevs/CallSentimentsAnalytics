package com.acxiom.service;

import com.acxiom.Dao.AgentPerformanceCommentsDao;
import com.acxiom.entity.AgentPerformanceComments;
import com.acxiom.entity.DefaultAnalysis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AgentPerformanceCommentsService {

    @Autowired
    private AgentPerformanceCommentsDao agentPerformanceCommentsDao;

    public List<AgentPerformanceComments> agentPerformanceCommentsList(){
        Iterable<AgentPerformanceComments> agentPerformanceComments =  agentPerformanceCommentsDao.findAll();

        List<AgentPerformanceComments> agentPerformanceCommentsList = new ArrayList<>();
        for(AgentPerformanceComments record: agentPerformanceComments){
            agentPerformanceCommentsList.add(record);
        }
        return agentPerformanceCommentsList;
    }
}
