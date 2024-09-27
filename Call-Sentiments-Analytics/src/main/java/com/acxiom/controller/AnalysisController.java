package com.acxiom.controller;

import com.acxiom.entity.AgentPerformanceComments;
import com.acxiom.entity.CrossSelling;
import com.acxiom.entity.DefaultAnalysis;
import com.acxiom.service.AgentPerformanceCommentsService;
import com.acxiom.service.CallDetailsService;
import com.acxiom.service.CrossSellingService;
import com.acxiom.service.DefaultAnalysisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class AnalysisController {

    @Autowired
    private DefaultAnalysisService defaultAnalysisService;

    @Autowired
    private CallDetailsService callDetailsService;

    @Autowired
    private AgentPerformanceCommentsService agentPerformanceCommentsService;

    @Autowired
    private CrossSellingService crossSellingService;

    @GetMapping({"/default-analysis"})
    public List<DefaultAnalysis> getAnalysisList(){
        return defaultAnalysisService.analysisList();
    }

    @PostMapping({"/agent-performance-comments"})
    public List<AgentPerformanceComments> getAgentPerformanceComments(Integer agentId){
        return agentPerformanceCommentsService.agentPerformanceComments(agentId);
    }

    @GetMapping({"/cross-selling-details"})
    public List<CrossSelling> getCrossSellingList(){
        return crossSellingService.crossSellingList();
    }

    @PostMapping("/getAgentAnalytics")
    public List<DefaultAnalysis> getAgentAnalytics(String agentId){
        return defaultAnalysisService.analysisAgentList(agentId);
    }

    @PostMapping("/getManagerReviewData")
    public List<DefaultAnalysis> getManagerReviewData(String[] agentIds){
        return defaultAnalysisService.getManagerReviewData(agentIds);
    }


    @PostMapping("/remove-agent")
    public String deleteEntity(String callId){
        return defaultAnalysisService.removeAgent(callId);
    }

    @PostMapping({"/getAudioFile"})
    public String getAudioList(String callId){
        return callDetailsService.callDetailsList(callId);
    }

}
