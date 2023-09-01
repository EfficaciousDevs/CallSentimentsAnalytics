//package com.acxiom.service;
//
//import com.acxiom.Dao.RoleDao;
//import com.acxiom.Dao.UserDao;
//import com.acxiom.entity.Role;
//import com.acxiom.entity.User;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import java.util.*;
//
//@Service
//public class UserService {
//
//    @Autowired
//    private UserDao userDao;
//
//    @Autowired
//    private RoleDao roleDao;
//
//    @Autowired
//    private PasswordEncoder passwordEncoder;
//
//    public void initRoleAndUser() {
//
//        Role adminRole = new Role();
//        adminRole.setRoleName("Admin");
//        adminRole.setRoleDescription("Admin Role");
//        roleDao.save(adminRole);
//
//        Role managerRole = new Role();
//        managerRole.setRoleName("Manager");
//        managerRole.setRoleDescription("Manager Role");
//        roleDao.save(managerRole);
//
//        Role userRole = new Role();
//        userRole.setRoleName("User");
//        userRole.setRoleDescription("Default User Role");
//        roleDao.save(userRole);
//
//        User adminUser = new User();
//        adminUser.setUserName("Admin");
//        adminUser.setUserPassword(getEncodedPassword("husein@vohra"));
//        adminUser.setUserFirstName("Husein");
//        adminUser.setUserLastName("Vohra");
//        Set<Role> adminRoles = new HashSet<>();
//        adminRoles.add(adminRole);
//        adminUser.setRole(adminRoles);
//        userDao.save(adminUser);
//
//        User manager = new User();
//        manager.setUserName("Manager");
//        manager.setUserPassword(getEncodedPassword("shashank@naik"));
//        manager.setUserFirstName("Shashank");
//        manager.setUserLastName("Naik");
//        Set<Role> managerRoles = new HashSet<>();
//        managerRoles.add(managerRole);
//        manager.setRole(managerRoles);
//        userDao.save(manager);
//
//        User user = new User();
//        user.setUserName("User");
//        user.setUserPassword(getEncodedPassword("akshay@kumar"));
//        user.setUserFirstName("Akshay");
//        user.setUserLastName("Kumar");
//        Set<Role> userRoles = new HashSet<>();
//        userRoles.add(userRole);
//        user.setRole(userRoles);
//        userDao.save(user);
//    }
//
//    public User registerNewUser(User user) {
//        Set<Role> userRoleName = user.getRole();
//        String passedRole = "";
//        for(Role role: userRoleName){
//            passedRole = role.getRoleName();
//        }
//        Role role = roleDao.findById(passedRole).get();
//        Set<Role> userRoles = new HashSet<>();
//        userRoles.add(role);
//        user.setRole(userRoles);
//        user.setUserPassword(getEncodedPassword(user.getUserPassword()));
//
//        return userDao.save(user);
//    }
//
//    public List<User> userList(){
//        Iterable<User> userRoles =  userDao.findAll();
//
//        List<User> rolesList = new ArrayList<>();
//        for(User user: userRoles){
//            rolesList.add(user);
//        }
//
//        return rolesList;
//    }
//    @Transactional
//    public String removeUser(String userName){
//        User deletedUser = userDao.findByUserName(userName);
//        if (deletedUser != null) {
//            userDao.delete(deletedUser);
//            return deletedUser.getUserName() + " "+ "has been deleted successfully.";
//        }else{
//            return "User Not found...";
//        }
//    }
//
//    public String updateUser(User user){
//        User updateUser = userDao.findByUserName(user.getUserName());
//
//        if(updateUser != null){
//            updateUser.setUserFirstName(user.getUserFirstName());
//            updateUser.setUserLastName(user.getUserLastName());
//            updateUser.setUserPassword(getEncodedPassword(user.getUserPassword()));
//            updateUser.setUserName(user.getUserName());
//            updateUser.setRole(user.getRole());
//
//            userDao.save(updateUser);
//            return "Updated Successfully";
//        }
//        return "Update Failure";
//    }
//
//public String getEncodedPassword(String password) {
//        return passwordEncoder.encode(password);
//    }
//}
