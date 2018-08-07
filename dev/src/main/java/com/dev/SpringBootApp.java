package com.dev;

import org.springframework.boot.Banner;
import org.springframework.boot.ExitCodeGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@PropertySource(value ={"mvc.properties"},encoding = "utf-8")
@EnableEurekaClient
@EnableFeignClients
public class SpringBootApp
{

    @Bean
    public ExitCodeGenerator exitCodeGenerator() {
        return () -> 42;
    }
    public static void main( String[] args )
    {
        SpringApplication application = new SpringApplication(SpringBootApp.class);
        application.setBannerMode(Banner.Mode.OFF);
        application.run("xxxxi");
    }
}
