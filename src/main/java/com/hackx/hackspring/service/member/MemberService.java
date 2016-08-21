package com.hackx.hackspring.service.member;

import com.hackx.hackspring.domain.memeber.MemberDO;

/**
 * Created by hackx on 8/21/16.
 */
public interface MemberService {

    MemberDO queryById(Long id);

}
