package com.hackx.hackspring.user.web;

import com.hackx.hackspring.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by hackx on 8/14/16.
 */
@Controller
@EnableAutoConfiguration
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }


}
