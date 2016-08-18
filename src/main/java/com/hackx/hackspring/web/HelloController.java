package com.hackx.hackspring.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hackx on 8/18/16.
 */
@RestController
public class HelloController {

    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }
}
