package com.example.demo.service;

import com.example.demo.model.User;
import java.util.List;

public interface UserService {

     void addUser(User user);
     void deleteUser(Integer id);
     void updateUser(User user);

     List<User>  users();
//     void saveAll(List<User> users);
//
//     User getUserByUserName(String name) ;

     List<User> getUserByNameAndTel(String name,String tel);

     List<User> getUserByNameLike(String name);

}
