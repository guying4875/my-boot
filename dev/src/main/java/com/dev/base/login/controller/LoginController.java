package com.dev.base.login.controller;

import com.dev.base.config.Student;
import com.dev.base.config.User;
import com.dev.propert.Init;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhjx on 2018/7/17.
 */
@RestController
@Import(Init.class)
public class LoginController {

    @Autowired
    Student s ;
    @Autowired
    User u ;

    @Autowired
    Init init;

    @RequestMapping("/")
    public String login(){
        System.out.println(init.getUrl());
        System.out.println(init.getUserList().get(2).getName());
        System.out.println(init.getConfigMap().get("name"));
        return "login"+s.getName()+u.getName();
    }
}
