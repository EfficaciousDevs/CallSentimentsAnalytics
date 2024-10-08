package com.acxiom.entity;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "performance_track_db")
public class PerformanceTrack {

    @Id
    @Column(name = "agent_id")
    private int agentId;

    @Column(name = "agent_name")
    private String agentName;

    @Column(name = "manager_id")
    private int managerId;

    @Column(name = "manager_name")
    private String managerName;

    @Column(name = "training_start_date")
    private Date trainingStartDate;

    @Column(name= "training_end_date")
    private Date trainingEndDate;


    @Column(name = "training_course")
    private String trainingCourse;

    @Column(name = "last_logged_in")
    private Date lastLoggedIn;

    public Date getLastLoggedIn() {
        return lastLoggedIn;
    }

    public void setLastLoggedIn(Date lastLoggedIn) {
        this.lastLoggedIn = lastLoggedIn;
    }

    public int getAgentId() {
        return agentId;
    }

    public void setAgentId(int agentId) {
        this.agentId = agentId;
    }

    public String getAgentName() {
        return agentName;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }

    public int getManagerId() {
        return managerId;
    }

    public void setManagerId(int managerId) {
        this.managerId = managerId;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public Date getTrainingStartDate() {
        return trainingStartDate;
    }

    public void setTrainingStartDate(Date trainingStartDate) {
        this.trainingStartDate = trainingStartDate;
    }

    public Date getTrainingEndDate() {
        return trainingEndDate;
    }

    public void setTrainingEndDate(Date trainingEndDate) {
        this.trainingEndDate = trainingEndDate;
    }

//    public int getTrainingDays() {
//        return trainingDays;
//    }
//
//    public void setTrainingDays(int trainingDays) {
//        this.trainingDays = trainingDays;
//    }

    public String getTrainingCourse() {
        return trainingCourse;
    }

    public void setTrainingCourse(String trainingCourse) {
        this.trainingCourse = trainingCourse;
    }
}
