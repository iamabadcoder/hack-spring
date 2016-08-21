package com.hackx.hackspring.mapper.member;

import com.hackx.hackspring.domain.memeber.MemberDO;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by hackx on 8/21/16.
 */
@Mapper
public interface MemberMapper {

    MemberDO queryById(Long id);
}
