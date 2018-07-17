package com.dev.base.config;

import org.springframework.context.annotation.Bean;

/**
 * Created by zhjx on 2018/7/17.
 */
public class UserManage {

    @Bean
    public User initUser(){
        User u = new User();
        u.setName("user name");
        return u;
    }
}
