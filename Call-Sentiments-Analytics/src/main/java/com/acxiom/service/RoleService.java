package com.acxiom.service;

import com.acxiom.Dao.ManagerAgentDao;
import com.acxiom.Dao.RoleDao;
import com.acxiom.entity.ManagerAgentTable;
import com.acxiom.entity.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class RoleService {

    @Autowired
    private RoleDao roleDao;

    @Autowired
    ManagerAgentDao managerAgentDao;


    public List<ManagerAgentTable> userList(){
        Iterable<ManagerAgentTable> managerAgentTables =  managerAgentDao.findAll();

        List<ManagerAgentTable> managerAgentTableList = new ArrayList<>();
        for(ManagerAgentTable user: managerAgentTables){
            managerAgentTableList.add(user);
        }

        return managerAgentTableList;
    }

    public ManagerAgentTable addAgentHelper(ManagerAgentTable agent){
        ManagerAgentTable managerAgentTable = new ManagerAgentTable();


        managerAgentTable.setManagerName(agent.getManagerName());
        managerAgentTable.setAgentName(agent.getAgentName());
        managerAgentTable.setManagerId(agent.getManagerId());

        return managerAgentDao.save(managerAgentTable);

    }

    public Role createNewRole(Role role) {
        return roleDao.save(role);
    }
}
