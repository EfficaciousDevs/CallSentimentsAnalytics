package com.acxiom.controller;


import com.acxiom.entity.AgentPerformanceComments;
import com.acxiom.entity.CategoryWiseCommonProblems;
import com.acxiom.entity.PerformanceTrack;
import com.acxiom.service.AgentPerformanceCommentsService;
import com.acxiom.service.AgentService;
import com.acxiom.service.CategoryWiseCommonProblemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class AgentManagerController {

    @Autowired
    private AgentService agentService;

    @Autowired
    private AgentPerformanceCommentsService agentPerformanceCommentsService;

    @Autowired
    private CategoryWiseCommonProblemsService categoryWiseCommonProblemsService;

    @GetMapping({"/getAgentPerformanceComments"})
    private List<AgentPerformanceComments> getAllPerformanceComments() {
        return agentPerformanceCommentsService.agentPerformanceCommentsList();
    }

    @GetMapping({"/getCategoryProblems"})
    private List<CategoryWiseCommonProblems> getAllCategoryProblems() {
        return categoryWiseCommonProblemsService.categoryWiseCommonProblemsList();
    }

    @GetMapping({"/get-learners"})
    public List<PerformanceTrack> getList(){
        return agentService.learnerList();
    }

    @PostMapping({"/addLearners"})
    public String addLearners(@RequestBody PerformanceTrack learner){
        return agentService.addLearners(learner);
    }

    @PostMapping({"/find-agent"})
    public PerformanceTrack findAgentData(int agentId){
        return agentService.findLearner(agentId);
    }

}
