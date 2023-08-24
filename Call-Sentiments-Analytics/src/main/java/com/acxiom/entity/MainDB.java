package com.acxiom.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "main_db")
public class MainDB {

    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int userId;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "agent_name")
    private String agentName;

    @Column(name = "manager_id")
    private int managerId;

    @Column(name = "manager_name")
    private String managerName;

    @Column(name = "admin_id")
    private int adminId;

    @Column(name = "admin_name")
    private String adminName;

    @Column(name = "password")
    private String password;

    @Column(name = "role_type")
    private String roleType;

    @Column(name = "training_flag")
    private String trainingFlag;

    @Column(name = "training_days")
    private int trainingDays;

    @Column(name = "training_start_date")
    private Date trainingStartDate;

    @Column(name = "training_end_date")
    private Date trainingEndDate;

    @Column(name = "training_program")
    private String trainingProgram;


    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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

    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRoleType() {
        return roleType;
    }

    public void setRoleType(String roleType) {
        this.roleType = roleType;
    }

    public String getTrainingFlag() {
        return trainingFlag;
    }

    public void setTrainingFlag(String trainingFlag) {
        this.trainingFlag = trainingFlag;
    }

    public int getTrainingDays() {
        return trainingDays;
    }

    public void setTrainingDays(int trainingDays) {
        this.trainingDays = trainingDays;
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

    public String getTrainingProgram() {
        return trainingProgram;
    }

    public void setTrainingProgram(String trainingProgram) {
        this.trainingProgram = trainingProgram;
    }
}
