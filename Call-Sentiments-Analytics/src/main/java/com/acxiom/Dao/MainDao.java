package com.acxiom.Dao;

import com.acxiom.entity.MainDB;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MainDao extends JpaRepository<MainDB,Integer> {

    MainDB findById(int userId);
    MainDB findByUserName(String username);
}
