package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.model.User;

import java.util.List;


@Repository
public interface UserRepository extends JpaRepository<User,Integer> {

    List<User> findByNameAndTel(String name,String tel);
    List<User> findByNameLike(String name);
}
