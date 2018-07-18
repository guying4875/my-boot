package com.dev.base.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * Created by zhjx on 2018/7/17.
 * 获取spring boot 启动参数类
 */
@Component
public class AppStartArgument {
    private boolean debug;

    @Autowired
    public AppStartArgument(ApplicationArguments args){
        debug = args.containsOption("debug");
        System.out.println(debug);

//        System.out.println(args.containsOption("spring.application.name"));
        Set<String> setStr = args.getOptionNames();
        Iterator<String> iter = setStr.iterator();
        String key = null;
        while(iter.hasNext()){
            key = iter.next();
            System.out.println("key = "+ key);
            System.out.println("value = "+ args.getOptionValues(key));
        }

        List<String> strList = args.getNonOptionArgs();
        for (String s : strList){
            System.out.println(" nonOption = "+ s);
        }
    }

    public boolean isDebug() {
        return debug;
    }

    public void setDebug(boolean debug) {
        this.debug = debug;
    }
}
