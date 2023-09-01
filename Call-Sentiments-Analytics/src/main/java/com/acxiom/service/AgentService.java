package com.acxiom.service;


//import com.acxiom.Dao.ManagerAgentDao;

import com.acxiom.Dao.PerformanceTrackDao;
//import com.acxiom.entity.ManagerAgentTable;
import com.acxiom.entity.PerformanceTrack;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.*;

@Service
public class AgentService {

//    @Autowired
//    private ManagerAgentDao managerAgentDao;

    @Autowired
    private PerformanceTrackDao performanceTrackDao;


//    public List<ManagerAgentTable> userList(){
//        Iterable<ManagerAgentTable> managerAgentTables =  managerAgentDao.findAll();
//
//        List<ManagerAgentTable> managerAgentTableList = new ArrayList<>();
//        for(ManagerAgentTable user: managerAgentTables){
//            managerAgentTableList.add(user);
//        }
//
//        return managerAgentTableList;
//    }

    public List<PerformanceTrack> learnerList(){
        Iterable<PerformanceTrack> performanceTracks =  performanceTrackDao.findAll();

        List<PerformanceTrack> PerformanceTrackList = new ArrayList<>();
        for(PerformanceTrack user: performanceTracks){
            PerformanceTrackList.add(user);
        }

        return PerformanceTrackList;
    }

    public String addLearners(PerformanceTrack learner){
        performanceTrackDao.save(learner);
        return "Added Successfully.";
    }

//    public String addAgentHelper(ManagerAgentTable agent){
//        ManagerAgentTable managerAgentTable = new ManagerAgentTable();
//        Optional<ManagerAgentTable> managerAgentTable1 = managerAgentDao.findById(agent.getAgentId());
//        if(!managerAgentTable1.isPresent()) {
//            managerAgentTable.setAgentName(agent.getAgentName());
//            managerAgentTable.setManagerName(agent.getManagerName());
//            managerAgentTable.setManagerId(agent.getManagerId());
//            managerAgentDao.save(managerAgentTable);
//            return "Agent Added Successfully.";
//        }else{
//            return "Agent Already Exists.";
//        }
//    }
//
//    public String assignTraining(ManagerAgentTable agent){
//        ManagerAgentTable managerAgentTable = new ManagerAgentTable();
//        Optional<ManagerAgentTable> managerAgentTable1 = managerAgentDao.findById(agent.getAgentId());
//        if(managerAgentTable1.isPresent()) {
//            managerAgentTable.setTrainingDays(agent.getTrainingDays());
//            managerAgentTable.setTrainingFlag(1);
//            managerAgentTable.setTrainingStartDate(agent.getTrainingStartDate());
//            managerAgentTable.setTrainingEndDate(agent.getTrainingEndDate());
//            managerAgentDao.save(managerAgentTable);
//            return "Training Program assigned to the Agent Successfully.";
//        }else{
//            return "Agent Not Found.";
//        }
//    }
//
//    public String deleteAgent(int agentId){
//        ManagerAgentTable managerAgentTable = managerAgentDao.findByAgentId(agentId);
//
//        if(Objects.nonNull(managerAgentTable)) {
//            managerAgentDao.delete(managerAgentTable);
//            return "USER DELETED SUCCESSFULLY.";
//        }else{
//            return "USER NOT PRESENT.";
//        }
//    }
}
