package com.acxiom.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.File;
import java.util.Date;

@Entity
@Table(name = "default_analysis")
public class DefaultAnalysis {

    @Id
    @Column(name = "call_id")
    private String callId;

//    @Column(name = "customer_support_area_of_improvement")
//    private String custSuppAreaOfImprov;
//
    @Column(name = "agent_name")
    private String agentName;
//
//    @Column(name = "greet_text")
//    private String greetText;
//
//    @Column(name = "customer_satisfaction")
//    private String customerSatisfaction;
//
//    @Column(name = "closing_greeting")
//    private String closingGreeting;
//
//    @Column(name = "further_assistance_offered")
//    private String assistanceOffered;

    @Column(name = "call_hold_permission_asked")
    private String callHoldPermission;

    @Column(name = "call_transfer_permission_asked")
    private String transferPermission;

//    @Column(name = "conclusion")
//    private String conclusion;
//    @Column(name = "resolution_status")
//    private String resolutionStatus;
//    @Column(name = "resolution_status_reason")
//    private String resolutionStatusReason;

    @Column(name = "customer_problem_or_requirement")
    private String customerProblem;

    @Column(name = "customer_support_sentiment")
    private String custSuppSentiment;

//    @Column(name = "customer_sentiment")
//    private String  customerSentiment;
//
//    @Column(name = "conversational_sentiment")
//    private String conversationalSentiment;
//
    @Column(name = "key_score")
    private int keyScore;

    @Column(name = "summary")
    private String summary;

    @Column(name = "agent_id")
    private String agentId;

    @Column(name = "call_category")
    private String callCategory;

    @Column(name = "datetime")
    private Date dateTime;

//    @Column(name = "call_duration")
//    private int callDuration;
//
//    @Column(name="review_flag")
//    private int reviewFlag;
//
    @Column(name = "remark")
    private String remark;



    @Column(name = "manager_id")
    private int managerId;

    @Column(name = "manager_name")
    private String managerName;

    public int getKeyScore() {
        return keyScore;
    }

    public void setKeyScore(int keyScore) {
        this.keyScore = keyScore;
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

    public String getAgentName() {
        return agentName;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }

    public String getCallId() {
        return callId;
    }

    public void setCallId(String callId) {
        this.callId = callId;
    }

//    public String getCustSuppAreaOfImprov() {
//        return custSuppAreaOfImprov;
//    }
//
//    public void setCustSuppAreaOfImprov(String custSuppAreaOfImprov) {
//        this.custSuppAreaOfImprov = custSuppAreaOfImprov;
//    }
//
//    public String getConclusion() {
//        return conclusion;
//    }
//
//    public void setConclusion(String conclusion) {
//        this.conclusion = conclusion;
//    }
//
//    public String getResolutionStatus() {
//        return resolutionStatus;
//    }
//
//    public void setResolutionStatus(String resolutionStatus) {
//        this.resolutionStatus = resolutionStatus;
//    }
//
//    public String getResolutionStatusReason() {
//        return resolutionStatusReason;
//    }
//
//    public void setResolutionStatusReason(String resolutionStatusReason) {
//        this.resolutionStatusReason = resolutionStatusReason;
//    }
//
//    public String getCustomerGreeted() {
//        return customerGreeted;
//    }
//
//    public void setCustomerGreeted(String customerGreeted) {
//        this.customerGreeted = customerGreeted;
//    }
//
//    public String getGreetText() {
//        return greetText;
//    }
//
//    public void setGreetText(String greetText) {
//        this.greetText = greetText;
//    }
//
//    public String getCustomerSatisfaction() {
//        return customerSatisfaction;
//    }
//
//    public void setCustomerSatisfaction(String customerSatisfaction) {
//        this.customerSatisfaction = customerSatisfaction;
//    }
//
//    public String getClosingGreeting() {
//        return closingGreeting;
//    }
//
//    public void setClosingGreeting(String closingGreeting) {
//        this.closingGreeting = closingGreeting;
//    }
//
//    public String getAssistanceOffered() {
//        return assistanceOffered;
//    }
//
//    public void setAssistanceOffered(String assistanceOffered) {
//        this.assistanceOffered = assistanceOffered;
//    }

    public String getCallHoldPermission() {
        return callHoldPermission;
    }

    public void setCallHoldPermission(String callHoldPermission) {
        this.callHoldPermission = callHoldPermission;
    }

    public String getTransferPermission() {
        return transferPermission;
    }

    public void setTransferPermission(String transferPermission) {
        this.transferPermission = transferPermission;
    }

//    public int getCallDuration() {
//        return callDuration;
//    }
//
//    public void setCallDuration(int callDuration) {
//        this.callDuration = callDuration;
//    }
//
//    public int getReviewFlag() {
//        return reviewFlag;
//    }
//
//    public void setReviewFlag(int reviewFlag) {
//        this.reviewFlag = reviewFlag;
//    }
//
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }



    public String getCustomerProblem() {
        return customerProblem;
    }

    public void setCustomerProblem(String customerProblem) {
        this.customerProblem = customerProblem;
    }

    public String getCustSuppSentiment() {
        return custSuppSentiment;
    }

    public void setCustSuppSentiment(String custSuppSentiment) {
        this.custSuppSentiment = custSuppSentiment;
    }

//    public String getCustomerSentiment() {
//        return customerSentiment;
//    }
//
//    public void setCustomerSentiment(String customerSentiment) {
//        this.customerSentiment = customerSentiment;
//    }
//
//    public String getConversationalSentiment() {
//        return conversationalSentiment;
//    }
//
//    public void setConversationalSentiment(String conversationalSentiment) {
//        this.conversationalSentiment = conversationalSentiment;
//    }
//
//    public String getTopic() {
//        return topic;
//    }
//
//    public void setTopic(String topic) {
//        this.topic = topic;
//    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getAgentId() {
        return agentId;
    }

    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

    public String getCallCategory() {
        return callCategory;
    }

    public void setCallCategory(String callCategory) {
        this.callCategory = callCategory;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }
}
