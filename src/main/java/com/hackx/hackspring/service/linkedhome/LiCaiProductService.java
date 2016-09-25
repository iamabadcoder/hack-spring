package com.hackx.hackspring.service.linkedhome;

import com.hackx.hackspring.domain.linkedhome.LiCaiProductDO;

/**
 * Created by hackx on 9/25/16.
 */
public interface LiCaiProductService {

    Long insert(LiCaiProductDO liCaiProductDO);

    Integer delete(Long id);

    Integer update(LiCaiProductDO liCaiProductDO);

    LiCaiProductDO queryById(Long id);

}
