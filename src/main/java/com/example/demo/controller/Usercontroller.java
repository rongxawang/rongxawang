package com.example.demo.controller;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.model.User;

import java.util.List;

@RestController
@RequestMapping("/user")
public class Usercontroller {
    @Autowired
    private UserService userService;
//
//    @PostMapping("/save")
//    public String save()
//    {
//        User user1=new User(1,"john",12,"male","13838388294");
//        User user2=new User(2,"lily",13,"fm","13832848821");
//        User user3=new User(3,"nana",18,"fm","18717396890");
//        List<User> users = new ArrayList<>();
//        users.add(user1);
//        users.add(user2);
//        users.add(user3);
//        userService.saveAll(users);
//        return "保存成功";
//    }

    @GetMapping()
    public List<User> usersList()
    {
        return userService.users();
    }

    //增加一个用户
    @PostMapping()
    public String addUser(@RequestBody User user)
    {
        userService.addUser(user);
        return "保存成功";
    }

    //删除一个用户
    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable("id") Integer id)
    {
        userService.deleteUser(id);
        return "删除成功";
    }

    //改
    @PutMapping()
    public String updateUser(@RequestBody User user)
    {
        userService.updateUser(user);
        return "保存成功";
    }

//    根据名字查找
//    @GetMapping("/{name}")
//    public User getUserByName(@PathVariable("name") String name) {
//        return userService.getUserByUserName(name);
//    }

    @GetMapping("/{name}/{tel}")
    public List<User> getUserByNameAndTel(@PathVariable("name") String name,
                                   @RequestParam("tel") String tel)
    {
        return userService.getUserByNameAndTel(name,tel);
    }

    @GetMapping("/{name}")
    public List<User> getUserByNameLike(@PathVariable("name") String name)
    {
        return userService.getUserByNameLike(name);
    }
}
