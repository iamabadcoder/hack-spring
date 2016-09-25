package com.hackx.hackspring.mapper.linkedhome;

import com.hackx.hackspring.domain.linkedhome.LiCaiProductDO;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by hackx on 9/25/16.
 */
@Mapper
public interface LiCaiProductMapper {

    Long insert(LiCaiProductDO liCaiProductDO);

    Integer delete(Long id);

    Integer update(LiCaiProductDO liCaiProductDO);

    LiCaiProductDO queryById(Long id);
}
