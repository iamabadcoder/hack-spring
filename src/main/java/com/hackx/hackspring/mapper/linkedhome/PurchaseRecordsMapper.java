package com.hackx.hackspring.mapper.linkedhome;

import com.hackx.hackspring.domain.linkedhome.PurchaseRecordsDO;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by hackx on 9/25/16.
 */
@Mapper
public interface PurchaseRecordsMapper {

    Long insert(PurchaseRecordsDO purchaseRecordsDO);

    Integer delete(Long id);

    Integer update(PurchaseRecordsDO purchaseRecordsDO);

    PurchaseRecordsDO queryById(Long id);
}
