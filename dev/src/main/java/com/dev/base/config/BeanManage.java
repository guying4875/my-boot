package com.dev.base.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by zhjx on 2018/7/17.
 */
@Configuration
@Import(UserManage.class)
public class BeanManage {

    @Bean
    public Student initStudent(){
        Student s = new Student();
        s.setName("xiaoxiao");
        s.setAge(4);
        return s;
    }
}
