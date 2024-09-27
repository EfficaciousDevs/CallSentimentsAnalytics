package com.acxiom.service;


import com.acxiom.Dao.CrossSellingDao;
import com.acxiom.entity.AgentPerformanceComments;
import com.acxiom.entity.CrossSelling;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CrossSellingService {

    @Autowired
    private CrossSellingDao crossSellingDao;


    public List<CrossSelling> crossSellingList(){
        Iterable<CrossSelling> crossSellings =  crossSellingDao.findAll();

        List<CrossSelling> crossSellingList = new ArrayList<>();
        for(CrossSelling record: crossSellings){
            crossSellingList.add(record);
        }
        return crossSellingList;
    }
}
