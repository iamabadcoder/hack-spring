package com.hackx.hackspring.service.linkedhome.impl;

import com.google.common.base.Preconditions;
import com.hackx.hackspring.domain.linkedhome.PurchaseRecordsDO;
import com.hackx.hackspring.mapper.linkedhome.PurchaseRecordsMapper;
import com.hackx.hackspring.service.linkedhome.PurchaseRecordsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class PurchaseRecordsServiceImpl implements PurchaseRecordsService {

    private static Logger logger = LoggerFactory.getLogger(LiCaiProductServiceImpl.class);

    @Autowired
    PurchaseRecordsMapper purchaseRecordsMapper;

    @Override
    public Long insert(PurchaseRecordsDO purchaseRecordsDO) {
        try {
            Preconditions.checkNotNull(purchaseRecordsDO, "purchaseRecordsDO is null");
            Long row = purchaseRecordsMapper.insert(purchaseRecordsDO);
            if (null != row && row.longValue() == 1) {
                return purchaseRecordsDO.getId();
            }
        } catch (Exception e) {
            logger.error("Exception occurs when PurchaseRecordsServiceImpl.insert(), {}, {} ", purchaseRecordsDO, e);
        }
        return null;
    }

    @Override
    public Integer delete(Long id) {
        try {
            Preconditions.checkNotNull(id, "id is null");
            return purchaseRecordsMapper.delete(id);
        } catch (Exception e) {
            logger.error("Exception occurs when PurchaseRecordsServiceImpl.delete(), id is {}, {} ", id, e);
        }
        return null;
    }

    @Override
    public Integer update(PurchaseRecordsDO purchaseRecordsDO) {
        try {
            Preconditions.checkNotNull(purchaseRecordsDO, "purchaseRecordsDO is null");
            return purchaseRecordsMapper.update(purchaseRecordsDO);
        } catch (Exception e) {
            logger.error("Exception occurs when PurchaseRecordsServiceImpl.update(), {}, {} ", purchaseRecordsDO, e);
        }
        return null;
    }

    @Override
    public PurchaseRecordsDO queryById(Long id) {
        try {
            Preconditions.checkNotNull(id, "id is null");
            return purchaseRecordsMapper.queryById(id);
        } catch (Exception e) {
            logger.error("Exception occurs when PurchaseRecordsServiceImpl.update(), id is {}, {} ", id, e);
        }
        return null;
    }
}
