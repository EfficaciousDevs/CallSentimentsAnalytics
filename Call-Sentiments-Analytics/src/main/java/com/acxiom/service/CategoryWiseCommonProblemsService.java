package com.acxiom.service;

import com.acxiom.Dao.CategoryWiseCommonProblemsDao;
import com.acxiom.entity.CategoryWiseCommonProblems;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryWiseCommonProblemsService {

    @Autowired
    private CategoryWiseCommonProblemsDao categoryWiseCommonProblemsDao;

    public List<CategoryWiseCommonProblems> categoryWiseCommonProblemsList(){
        Iterable<CategoryWiseCommonProblems> categoryWiseCommonProblems =  categoryWiseCommonProblemsDao.findAll();

        List<CategoryWiseCommonProblems> categoryWiseCommonProblemsList = new ArrayList<>();

        for (CategoryWiseCommonProblems record : categoryWiseCommonProblems) {
            categoryWiseCommonProblemsList.add(record);
        }
        return categoryWiseCommonProblemsList;
    }
}
