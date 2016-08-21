package com.hackx.hackspring.service.member.impl;

import com.hackx.hackspring.domain.memeber.MemberDO;
import com.hackx.hackspring.mapper.member.MemberMapper;
import com.hackx.hackspring.service.member.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by hackx on 8/21/16.
 */
@Service("memberService")
public class MemberServiceImpl implements MemberService {

    @Autowired
    MemberMapper memberMapper;


    @Override
    public MemberDO queryById(Long id) {
        return memberMapper.queryById(id);
    }
}
