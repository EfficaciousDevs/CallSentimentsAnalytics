//package com.acxiom.entity;
//
//import javax.persistence.*;
//import java.util.List;
//
//@Entity
//@Table(name = "manager_table")
//public class Manager {
//
//
//    @Id
//    @Column(name = "manager_id")
////    @GeneratedValue(strategy = GenerationType.AUTO)
//    private int managerId;
//
//    @Column(name = "agent_id")
//    private int agentId;
//
//    @Column(name="manager_name")
//    private String managerName;
//
//
//    @ManyToMany(fetch = FetchType.EAGER, cascade = { CascadeType.PERSIST, CascadeType.MERGE})
//    @JoinTable(name = "agent_manager_table",
//            joinColumns = {
//                    @JoinColumn(name = "manager_id")
//            },
//            inverseJoinColumns = {
//                    @JoinColumn(name = "agent_id")
//            }
//    )
//
//
//    public int getManagerId() {
//        return managerId;
//    }
//
//    public void setManagerId(int managerId) {
//        this.managerId = managerId;
//    }
//
//    public int getAgentId() {
//        return agentId;
//    }
//
//    public void setAgentId(int agentId) {
//        this.agentId = agentId;
//    }
//
//    public String getManagerName() {
//        return managerName;
//    }
//
//    public void setManagerName(String managerName) {
//        this.managerName = managerName;
//    }
//}
