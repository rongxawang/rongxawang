package com.example.demo.controller;

import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.model.User;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping()
    @CrossOrigin(origins = "*")
    public List<User> usersList() {
        return userService.users();
    }

    //增加一个用户
    @PostMapping()
    @CrossOrigin(origins = "*")
    public User addUser(@RequestBody User user) {
        userService.addUser(user);
        return user;
    }

    //删除一个用户
    @DeleteMapping("/{id}")
    @CrossOrigin(origins = "*")
    public void deleteUser(@PathVariable("id") Integer id) {
        userService.deleteUser(id);

    }

    //改
    @PutMapping()
    @CrossOrigin(origins = "*")
    public User updateUser(@RequestBody User user) {
        userService.updateUser(user);
        return user;
    }


    @GetMapping("/{name}/{tel}")
    @CrossOrigin(origins = "*")
    public List<User> getUserByNameAndTel(@PathVariable("name") String name,
                                          @RequestParam("tel") String tel) {
        return userService.getUserByNameAndTel(name, tel);
    }

    @GetMapping("/{name}")
    @CrossOrigin(origins = "*")
    public List<User> getUserByNameLike(@PathVariable("name") String name) {
        return userService.getUserByNameLike(name);
    }
}
