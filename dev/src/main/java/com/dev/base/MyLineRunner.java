package com.dev.base;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

/**
 * Created by zhjx on 2018/7/17.
 * 指令启动参数
 */
@Component
public class MyLineRunner implements CommandLineRunner ,Ordered {
    @Override
    public void run(String... strings) throws Exception {
        System.out.println("CommandLineRunner");
    }

    /**
     * 设置类创建顺序
     * @return
     */
    @Override
    public int getOrder() {
        System.out.println("CommandLineRunner order 0");
        return 0;
    }
}
