//package com.acxiom.entity;
//
//import javax.persistence.*;
//import java.util.Date;
//import java.util.Set;
//
//@Entity
//@Table(name = "users_table")
//public class User {
//
//    @Id
//    @Column(name="user_name")
//    private String userName;
//    @Column(name="user_first_name")
//    private String userFirstName;
//    @Column(name="user_last_name")
//    private String userLastName;
//    @Column(name="user_password")
//    private String userPassword;
//
//    @ManyToMany(fetch = FetchType.EAGER, cascade = { CascadeType.PERSIST, CascadeType.MERGE})
//    @JoinTable(name = "user_roles",
//            joinColumns = {
//                    @JoinColumn(name = "user_name")
//            },
//            inverseJoinColumns = {
//                    @JoinColumn(name = "role_name")
//            }
//    )
//    private Set<Role> role;
//
//    public String getUserName() {
//        return userName;
//    }
//
//    public void setUserName(String userName) {
//        this.userName = userName;
//    }
//
//    public String getUserFirstName() {
//        return userFirstName;
//    }
//
//    public void setUserFirstName(String userFirstName) {
//        this.userFirstName = userFirstName;
//    }
//
//    public String getUserLastName() {
//        return userLastName;
//    }
//
//    public void setUserLastName(String userLastName) {
//        this.userLastName = userLastName;
//    }
//
//    public String getUserPassword() {
//        return userPassword;
//    }
//
//    public void setUserPassword(String userPassword) {
//        this.userPassword = userPassword;
//    }
//
//    public Set<Role> getRole() {
//        return role;
//    }
//
//    public void setRole(Set<Role> role) {
//        this.role = role;
//    }
//}