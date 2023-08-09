//package com.acxiom.repository;
//
//import com.acxiom.entity.Users;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.CrudRepository;
//import org.springframework.data.repository.query.Param;
//
//public interface UserRepo extends CrudRepository<Users,Long> {
//    @Query("SELECT u FROM User u WHERE u.username = :username")
//    public Users getUserByUsername(@Param("email") String username);
//}
