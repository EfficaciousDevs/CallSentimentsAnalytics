package com.acxiom.controller;


import com.acxiom.entity.ManagerAgentTable;
import com.acxiom.entity.PerformanceTrack;
import com.acxiom.service.AgentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.List;

@RestController
public class AgentManagerController {

    @Autowired
    private AgentService agentService;


//   @GetMapping({"/agentManagers"})
//    public List<ManagerAgentTable> agentTableList(){
//       return agentService.userList();
//   }
//
//   @PostMapping({"/addNewAgents"})
//    public String addAgents(ManagerAgentTable agent){
//       return agentService.addAgentHelper(agent);
//   }

    @GetMapping({"/get-learners"})
    public List<PerformanceTrack> getList(){
        return agentService.learnerList();
    }

    @PostMapping({"/addLearners"})
    public String addLearners(@RequestBody PerformanceTrack learner){
        return agentService.addLearners(learner);
    }

   @PostMapping({"/assignTraining"})
    public String assignTraining(@RequestBody ManagerAgentTable agent){
       return agentService.assignTraining(agent);
   }

   @PostMapping({"/delete-agents"})
    public String deleteAgents(int agentId){
        return agentService.deleteAgent(agentId);
   }
}
