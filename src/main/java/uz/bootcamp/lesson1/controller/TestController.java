package uz.bootcamp.lesson1.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {


    @GetMapping("/hello")
    public String helloMethod(){
        return "test";
    }





}
