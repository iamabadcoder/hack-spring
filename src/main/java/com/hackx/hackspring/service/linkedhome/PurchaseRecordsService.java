package com.hackx.hackspring.service.linkedhome;

import com.hackx.hackspring.domain.linkedhome.PurchaseRecordsDO;

/**
 * Created by hackx on 9/25/16.
 */
public interface PurchaseRecordsService {

    Long insert(PurchaseRecordsDO purchaseRecordsDO);

    Integer delete(Long id);

    Integer update(PurchaseRecordsDO purchaseRecordsDO);

    PurchaseRecordsDO queryById(Long id);
}
