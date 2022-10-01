package com.app.javajenkins.controlller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping("/msg")
    public  String getMsg(){
        return "Welcome in Java Integration With jenkins Project..";
    }
}
