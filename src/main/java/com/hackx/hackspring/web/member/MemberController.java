package com.hackx.hackspring.web.member;

import com.hackx.hackspring.service.member.MemberService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hackx on 8/18/16.
 */
@RestController
public class MemberController {

    private static Logger logger = Logger.getLogger(MemberController.class);

    @Autowired
    MemberService memberService;

    @RequestMapping("/")
    String home() {
        return memberService.queryById(1L).toString();
    }
}
