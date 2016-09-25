package com.hackx.hackspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by hackx on 8/14/16.
 */
@SpringBootApplication  // equal to @Configuration，@EnableAutoConfiguration和@ComponentScan
public class HackSpringApplication {

    public static void main(String[] args) {

        SpringApplication application = new SpringApplication(HackSpringApplication.class);
        application.run(args);
    }

}
