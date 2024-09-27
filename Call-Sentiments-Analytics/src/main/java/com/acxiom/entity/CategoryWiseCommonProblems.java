package com.acxiom.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="category_wise_common_problems")
public class CategoryWiseCommonProblems {

    @Id
    @Column(name = "\"serialKey\"")
    private int serialKey;

    @Column(name = "call_category")
    private String callCategory;

    @Column(name = "remark")
    private String remark;

    @Column(name = "datetime")
    private Date datetime;

    public int getSerialKey() {
        return serialKey;
    }

    public void setSerialKey(int serialKey) {
        this.serialKey = serialKey;
    }

    public String getCallCategory() {
        return callCategory;
    }

    public void setCallCategory(String callCategory) {
        this.callCategory = callCategory;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }
}
