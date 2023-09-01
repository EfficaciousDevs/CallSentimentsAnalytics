package com.acxiom.controller;

import com.acxiom.entity.MainDB;
import com.acxiom.service.MainDbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.Date;
import java.util.List;

@RestController
public class MainDbController {

    @Autowired
    private MainDbService mainDbService;

    @PostConstruct
    public void initMainDb() {
        mainDbService.initRoleAndUser();
    }
    @GetMapping({"/get-users"})
    public List<MainDB> getUsersDb(){
        return mainDbService.userList();
    }

    @PostMapping({"/register-user"})
    public String registerNewUser(@RequestBody MainDB user){
        return mainDbService.registerNewUser(user);
    }


    @PostMapping({"/delete-user"})
    public String deleteUser(int userId){
        return mainDbService.omitUser(userId);
    }

    @PostMapping({"/update-user"})
    public String updateUser(@RequestBody MainDB user){
        return mainDbService.editUser(user);
    }

    @PostMapping({"/login-status"})
    public String loginStatus(Date activeTimestamp,int userId){
        return mainDbService.loginStatus(activeTimestamp,userId);
    }
}
