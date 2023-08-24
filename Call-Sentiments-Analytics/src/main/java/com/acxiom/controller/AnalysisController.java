package com.acxiom.controller;

import com.acxiom.entity.CallDetails;
import com.acxiom.entity.DefaultAnalysis;
import com.acxiom.service.CallDetailsService;
import com.acxiom.service.DefaultAnalysisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AnalysisController {

    @Autowired
    private DefaultAnalysisService defaultAnalysisService;

    @Autowired
    private CallDetailsService callDetailsService;

    @GetMapping({"/default-analysis"})
    public List<DefaultAnalysis> getAnalysisList(){

        return defaultAnalysisService.analysisList();
    }

    @PostMapping({"/add-remarks"})
    public String addRemarks(@RequestBody DefaultAnalysis agent){

        return defaultAnalysisService.addRemarks(agent);
    }

    @PostMapping({"/getAudioFile"})
    public String getAudioList(String callId){
        return callDetailsService.callDetailsList(callId);
    }

}
