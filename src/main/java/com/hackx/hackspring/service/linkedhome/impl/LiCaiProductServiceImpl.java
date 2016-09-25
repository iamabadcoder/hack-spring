package com.hackx.hackspring.service.linkedhome.impl;

import com.google.common.base.Preconditions;
import com.hackx.hackspring.domain.linkedhome.LiCaiProductDO;
import com.hackx.hackspring.mapper.linkedhome.LiCaiProductMapper;
import com.hackx.hackspring.service.linkedhome.LiCaiProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by hackx on 9/25/16.
 */
public class LiCaiProductServiceImpl implements LiCaiProductService {

    private static Logger logger = LoggerFactory.getLogger(LiCaiProductServiceImpl.class);

    @Autowired
    LiCaiProductMapper liCaiProductMapper;

    @Override
    public Long insert(LiCaiProductDO liCaiProductDO) {
        try {
            Preconditions.checkNotNull(liCaiProductDO, "liCaiProductDO is null");
            Long row = liCaiProductMapper.insert(liCaiProductDO);
            if (null != row && row.longValue() == 1) {
                return liCaiProductDO.getId();
            }
        } catch (Exception e) {
            logger.error("Exception occurs when LiCaiProductServiceImpl.insert(), {}, {} ", liCaiProductDO, e);
        }
        return null;
    }

    @Override
    public Integer delete(Long id) {
        try {
            Preconditions.checkNotNull(id, "id is null");
            return liCaiProductMapper.delete(id);
        } catch (Exception e) {
            logger.error("Exception occurs when LiCaiProductServiceImpl.delete(), id is {}, {} ", id, e);
        }
        return null;
    }

    @Override
    public Integer update(LiCaiProductDO liCaiProductDO) {
        try {
            Preconditions.checkNotNull(liCaiProductDO, "liCaiProductDO is null");
            return liCaiProductMapper.update(liCaiProductDO);
        } catch (Exception e) {
            logger.error("Exception occurs when LiCaiProductServiceImpl.update(), {}, {} ", liCaiProductDO, e);
        }
        return null;
    }

    @Override
    public LiCaiProductDO queryById(Long id) {
        try {
            Preconditions.checkNotNull(id, "id is null");
            return liCaiProductMapper.queryById(id);
        } catch (Exception e) {
            logger.error("Exception occurs when LiCaiProductServiceImpl.update(), id is {}, {} ", id, e);
        }
        return null;
    }
}
