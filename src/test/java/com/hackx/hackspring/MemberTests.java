package com.hackx.hackspring;

import com.hackx.hackspring.service.member.MemberService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by hackx on 8/27/16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = HackSpringApplication.class)
public class MemberTests {

    @Autowired
    MemberService memberService;

    @Test
    public void queryMemberTest() {

        Assert.assertNull(memberService.queryById(1L));
    }


}
