package com.acxiom.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "agent_performance_comment")
public class AgentPerformanceComments {
    @Id
    @Column(name = "serialKey")
    private int serialKey;

    @Column(name = "agent_id")
    private int agentId;

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

    public int getAgentId() {
        return agentId;
    }

    public void setAgentId(int agentId) {
        this.agentId = agentId;
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
