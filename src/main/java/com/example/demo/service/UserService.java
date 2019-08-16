package com.example.demo.service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public void addUser(User user){
        userRepository.save(user);
    }

    public void deleteUser(Integer id){
        userRepository.deleteById(id);
    }

    public void updateUser(User user){
        userRepository.save(user);
    }

    public List<User> users()
    {
        return userRepository.findAll();
    }

    public List<User> getUserByNameAndTel(String name,String tel)
    {
        return userRepository.findByNameAndTel(name,tel);
    }

    public List<User> getUserByNameLike(String namelike)
    {
        return  userRepository.findByNameLike("%"+namelike+"%");
    }

}
