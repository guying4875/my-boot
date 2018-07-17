package com.dev;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class SpringBootApp
{
    public static void main( String[] args )
    {
        SpringApplication application = new SpringApplication(SpringBootApp.class);
        application.setBannerMode(Banner.Mode.OFF);
        application.run();
    }
}
