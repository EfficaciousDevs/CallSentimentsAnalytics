package com.acxiom.service;

import com.acxiom.Dao.RoleDao;
import com.acxiom.Dao.UserDao;
import com.acxiom.entity.Role;
import com.acxiom.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    @Autowired
    private RoleDao roleDao;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public void initRoleAndUser() {

        Role adminRole = new Role();
        adminRole.setRoleName("Admin");
        adminRole.setRoleDescription("Admin Role");
        roleDao.save(adminRole);

        Role managerRole = new Role();
        managerRole.setRoleName("Manager");
        managerRole.setRoleDescription("Manager Role");
        roleDao.save(managerRole);

        Role userRole = new Role();
        userRole.setRoleName("User");
        userRole.setRoleDescription("Default User Role");
        roleDao.save(userRole);

        User adminUser = new User();
        adminUser.setUserName("Admin");
        adminUser.setUserPassword(getEncodedPassword("husein@vohra"));
        adminUser.setUserFirstName("Husein");
        adminUser.setUserLastName("Vohra");
        Set<Role> adminRoles = new HashSet<>();
        adminRoles.add(adminRole);
        adminUser.setRole(adminRoles);
        userDao.save(adminUser);

        User manager = new User();
        manager.setUserName("Manager");
        manager.setUserPassword(getEncodedPassword("shashank@naik"));
        manager.setUserFirstName("Shashank");
        manager.setUserLastName("Naik");
        Set<Role> managerRoles = new HashSet<>();
        managerRoles.add(managerRole);
        manager.setRole(managerRoles);
        userDao.save(manager);

        User user = new User();
        user.setUserName("User");
        user.setUserPassword(getEncodedPassword("akshay@kumar"));
        user.setUserFirstName("Akshay");
        user.setUserLastName("Kumar");
        Set<Role> userRoles = new HashSet<>();
        userRoles.add(userRole);
        user.setRole(userRoles);
        userDao.save(user);
    }

    public User registerNewUser(User user) {
        Role role = roleDao.findById("User").get();
        Set<Role> userRoles = new HashSet<>();
        userRoles.add(role);
        user.setRole(userRoles);
        user.setUserPassword(getEncodedPassword(user.getUserPassword()));

        return userDao.save(user);
    }

    public String getEncodedPassword(String password) {
        return passwordEncoder.encode(password);
    }
}
