package com.acxiom.service;

import com.acxiom.Dao.CallDetailsDao;
import com.acxiom.entity.CallDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CallDetailsService {
    @Autowired
    private CallDetailsDao callDetailsDao;


    public String callDetailsList(String id){
        CallDetails callDetails = callDetailsDao.findByCallId(id);
        return callDetails.getAudioFile();
    }
}
