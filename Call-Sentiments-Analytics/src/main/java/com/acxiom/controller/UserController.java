//package com.acxiom.controller;
//
//
//import com.acxiom.entity.User;
//import com.acxiom.service.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.access.prepost.PreAuthorize;
//import org.springframework.web.bind.annotation.*;
//
//import javax.annotation.PostConstruct;
//import java.util.List;
//
//@RestController
//public class UserController {
//
//    @Autowired
//    private UserService userService;
//
//
//
//    @PostConstruct
//    public void initRoleAndUser() {
//        userService.initRoleAndUser();
//    }
//
//    @PostMapping({"/registerNewUser"})
//    public User registerNewUser(@RequestBody User user) {
//        return userService.registerNewUser(user);
//    }
//
//    @GetMapping({"/getUsers"})
//    public List<User> getUserList(){
//        return userService.userList();
//    }
//
//    @PostMapping({"/deleteUser"})
//    public String deleteUser(@RequestBody String username){
//        return userService.removeUser(username);
//    }
//
//    @PostMapping({"/updateUser"})
//    public String updateUser(@RequestBody User user){
//        return userService.updateUser(user);
//    }
//
//    @GetMapping({"/forAdmin"})
//    @PreAuthorize("hasRole('Admin')")
//    public String forAdmin(){
//        return "This URL is only accessible to Admins";
//    }
//
//    @GetMapping({"/forManager"})
//    @PreAuthorize("hasRole('Manager')")
//    public String forManager(){
//        return "This URL is only accessible to the Managers";
//    }
//
//    @GetMapping({"/forUser"})
//    @PreAuthorize("hasRole('User')")
//    public String forUser(){
//        return "This URL is only accessible to the all Users";
//    }
//}
