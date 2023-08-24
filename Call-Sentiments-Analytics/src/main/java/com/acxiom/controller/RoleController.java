package com.acxiom.controller;


import com.acxiom.entity.ManagerAgentTable;
import com.acxiom.entity.Role;
import com.acxiom.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RoleController {

    @Autowired
    private RoleService roleService;

    @GetMapping({"/agentManagers"})
    public List<ManagerAgentTable> agentTableList(){
       return roleService.userList();
   }

   @PostMapping({"/addNewAgents"})
    public ManagerAgentTable addAgents(@RequestBody ManagerAgentTable agent){
       return roleService.addAgentHelper(agent);
   }

    @PostMapping(path = "/createNewRole")
    public Role createNewRole(@RequestBody Role role) {
        return roleService.createNewRole(role);
    }
}
