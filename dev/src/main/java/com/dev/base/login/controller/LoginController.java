package com.dev.base.login.controller;

import com.dev.base.config.Student;
import com.dev.base.config.User;
import com.dev.propert.Init;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhjx on 2018/7/17.
 */
@Controller
//@Import(Init.class)
public class LoginController {

//    @Autowired
//    Student s ;
//    @Autowired
//    User u ;
//
//    @Autowired
//    Init init;

    @RequestMapping("/")
    public ModelAndView login(ModelAndView view){
        view.addObject("key","123445");
        User u = new User();
        u.setName("this is my user's name");
        view.addObject("user",u);
        view.addObject("url","baiduoo.com");
        view.addObject("id",1223);
        List<String> strList = new ArrayList<>();
        strList.add("12444");
        strList.add("12444");
        strList.add("12444");

        view.addObject("notEmptyList",strList);
        view.addObject("emptyList",new ArrayList<>());
        view.setViewName("index");
        return view;
    }
}
