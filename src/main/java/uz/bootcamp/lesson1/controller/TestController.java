package uz.bootcamp.lesson1.controller;

import org.springframework.web.bind.annotation.*;
import uz.bootcamp.lesson1.entities.User;
import uz.bootcamp.lesson1.services.UserService;

import java.util.Arrays;
import java.util.List;

@RestController
public class TestController {

   final UserService userService;

    public TestController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping("/hello")
    public String helloMethod(){
        return "test";
    }


    @RequestMapping("/users")
    public List<String>  getUser(){

        List<User> userList = userService.getAllUser();

        return Arrays.asList(userList.toString());
    }

    @PostMapping("/new")
    public void newUser(@RequestBody User user){
        userService.newUser(user);
    }

    @GetMapping("/view/{username}")
    public String getOneUser(@PathVariable("username") String username){
        return  userService.getOneUser(username);
    }



}
