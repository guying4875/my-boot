package com.dev.base.login.controller;

import com.dev.base.config.Student;
import com.dev.base.config.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhjx on 2018/7/17.
 */
@RestController
public class LoginController {

    @Autowired
    Student s ;
    @Autowired
    User u ;

    @RequestMapping("/")
    public String login(){
        return "login"+s.getName()+u.getName();
    }
}
