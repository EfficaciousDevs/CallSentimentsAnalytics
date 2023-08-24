package com.acxiom.service;

import com.acxiom.Dao.MainDao;
import com.acxiom.entity.MainDB;
import com.acxiom.entity.Role;
import com.acxiom.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

@Service
public class MainDbService {

    @Autowired
    private MainDao mainDao;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public boolean checkExistence(MainDB userRole){
        List<MainDB> listUsers  = mainDao.findAll();
        for(MainDB x: listUsers){
            if(Objects.equals(x.getUserName(), userRole.getUserName()))
                return false;
        }
        return true;
    }

    public void initRoleAndUser() {
        MainDB adminRole = new MainDB();
        adminRole.setAdminId(999);
        adminRole.setAdminName("Husein Vohra");
        adminRole.setUserName("huseinVohra");
        adminRole.setRoleType("Admin");
        adminRole.setPassword(getEncodedPassword("husein@vohra"));

        if(checkExistence(adminRole)){
            mainDao.save(adminRole);
        }

        MainDB managerRole = new MainDB();
        managerRole.setUserName("shashankManager");
        managerRole.setManagerId(100);
        managerRole.setManagerName("Shashank Naik");
        managerRole.setRoleType("Manager");
        managerRole.setPassword(getEncodedPassword("shashank@naik"));
        if(checkExistence(managerRole)){
            mainDao.save(managerRole);
        }


        MainDB userRole = new MainDB();
        userRole.setUserName("akshay9725");
        userRole.setAgentName("Akshay Kumar");
        userRole.setManagerId(100);
        userRole.setManagerName("Shashank Naik");
        userRole.setRoleType("User");
        userRole.setTrainingFlag("Not Active");
        userRole.setPassword(getEncodedPassword("akshay@kumar"));
        if(checkExistence(userRole)){
            mainDao.save(userRole);
        }
    }

    public String registerNewUser(MainDB user) {

        boolean alreadyExistsUser = checkExistence(user);
        MainDB newUser = new MainDB();

        if(alreadyExistsUser){
           newUser.setUserName(user.getUserName());

           if(Objects.nonNull(user.getAgentName()))
                newUser.setAgentName(user.getAgentName());

           if(user.getAdminId() != 0)
               newUser.setAdminId(user.getAdminId());

           if(Objects.nonNull(user.getAdminName()))
               newUser.setAdminName(user.getAdminName());

           if(user.getManagerId() != 0)
               newUser.setManagerId(user.getManagerId());

           if(Objects.nonNull(user.getManagerName()))
               newUser.setManagerName(user.getManagerName());

            newUser.setPassword(getEncodedPassword(user.getPassword()));

            newUser.setRoleType(user.getRoleType());
            newUser.setTrainingFlag(user.getTrainingStartDate() != null ? "Active" : "Not Active");

           if(user.getTrainingDays() > 0)
               newUser.setTrainingDays(user.getTrainingDays());

           if(user.getTrainingStartDate() != null)
               newUser.setTrainingStartDate(user.getTrainingStartDate());

           if(user.getTrainingEndDate() != null)
               newUser.setTrainingEndDate(user.getTrainingEndDate());

           if(Objects.nonNull(user.getTrainingProgram()))
               newUser.setTrainingProgram(user.getTrainingProgram());

            mainDao.save(newUser);
            return "USER HAS BEEN ADDED SUCCESSFULLY.";
        }
        return "USER ALREADY EXISTS";
    }
    @Transactional
    public String omitUser(int userId){
        MainDB deletedUser = mainDao.findById(userId);
        if (deletedUser != null) {
            mainDao.delete(deletedUser);
            return "User : " + deletedUser.getUserName() + " "+ "has been deleted successfully.";
        }else{
            return "User Not found...";
        }
    }

    public String editUser(MainDB updatedUser){
        MainDB updateUser = mainDao.findById(updatedUser.getUserId());

        if(updateUser != null){
            if(Objects.nonNull(updatedUser.getUserName()))
                updateUser.setUserName(updatedUser.getUserName());

            if(Objects.nonNull(updatedUser.getAgentName()))
                updateUser.setAgentName(updatedUser.getAgentName());

            if(updatedUser.getAdminId() != 0)
                updateUser.setAdminId(updatedUser.getAdminId());

            if(Objects.nonNull(updatedUser.getAdminName()))
                updateUser.setAdminName(updatedUser.getAdminName());

            if(updatedUser.getManagerId() != 0)
                updateUser.setManagerId(updatedUser.getManagerId());

            if(Objects.nonNull(updatedUser.getManagerName()))
                updateUser.setManagerName(updatedUser.getManagerName());

            if(Objects.nonNull(updatedUser.getPassword()))
                updateUser.setPassword(getEncodedPassword(updatedUser.getPassword()));

            if(Objects.nonNull(updatedUser.getRoleType()))
                updateUser.setRoleType(updatedUser.getRoleType());

            updateUser.setTrainingFlag(updatedUser.getTrainingStartDate() != null ? "Active" : "Not Active");

            if(updatedUser.getTrainingDays() > 0)
                updateUser.setTrainingDays(updatedUser.getTrainingDays());

            if(updatedUser.getTrainingStartDate() != null)
                updateUser.setTrainingStartDate(updatedUser.getTrainingStartDate());

            if(updatedUser.getTrainingEndDate() != null)
                updateUser.setTrainingEndDate(updatedUser.getTrainingEndDate());

            if(Objects.nonNull(updatedUser.getTrainingProgram()))
                updateUser.setTrainingProgram(updatedUser.getTrainingProgram());

            mainDao.save(updateUser);
            return "Updated Successfully";
        }
        return "Update Failure";
    }

    public List<MainDB> userList(){
        Iterable<MainDB> userRoles =  mainDao.findAll();

        List<MainDB> rolesList = new ArrayList<>();
        for(MainDB user: userRoles){
            rolesList.add(user);
        }

        return rolesList;
    }

    public String getEncodedPassword(String password) {
        return passwordEncoder.encode(password);
    }
}