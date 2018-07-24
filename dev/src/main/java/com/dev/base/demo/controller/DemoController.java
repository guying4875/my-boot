package com.dev.base.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("demo")
public class DemoController {

    /**
     * 验证采用th:replace方式布局的方式
     * @return
     */
    @RequestMapping("layout1")
    public String testLayout1(){
        return "demo/text";
    }

    /**
     * 验证采用layout方式布局的方式
     * @return
     */
    @RequestMapping("layout2")
    public String testLayout2(){
        return "demo/text2";
    }


}
