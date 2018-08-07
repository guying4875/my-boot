package com.dev.base.api;/**
 * @description
 * @author zhhy
 * @date 2018-08-18-8-7 上午10:33
 */

import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @description
 * @author zhhy
 * @date 2018-08-18-8-7 上午10:33
 *
 */
@RestController
@EnableEurekaClient
public class UserService {

    @RequestMapping("hi")
    public String sayHi(){
        return "hi cloud";
    }
}
