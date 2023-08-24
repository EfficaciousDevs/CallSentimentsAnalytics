package com.acxiom.service;

import com.acxiom.Dao.DefaultAnalysisDao;
import com.acxiom.entity.DefaultAnalysis;
import com.acxiom.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class DefaultAnalysisService {
    @Autowired
    DefaultAnalysisDao defaultAnalysisDao;

    public List<DefaultAnalysis> analysisList(){
        Iterable<DefaultAnalysis> defaultAnalyses =  defaultAnalysisDao.findAll();

        List<DefaultAnalysis> defaultAnalysisList = new ArrayList<>();
        for(DefaultAnalysis record: defaultAnalyses){
            if(Objects.equals(record.getCustSuppSentiment(), "Negative")){
                defaultAnalysisList.add(record);
            }

        }

        return defaultAnalysisList;
    }

    public String addRemarks(DefaultAnalysis agent){
        DefaultAnalysis agentUpdate = defaultAnalysisDao.findByCallId(agent.getCallId());

        if(Objects.nonNull(agentUpdate)){
            agentUpdate.setRemark(agent.getRemark());
            defaultAnalysisDao.save(agentUpdate);
            return "Remarks Added Successfully";
        }
        else{
            return "Remarks not added. Something Went Wrong";
        }

    }
}
