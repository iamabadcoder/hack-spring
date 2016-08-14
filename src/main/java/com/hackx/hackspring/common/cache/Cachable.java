package com.hackx.hackspring.common.cache;

import java.io.Serializable;

/**
 * Created by hackx on 8/14/16.
 */
public interface Cachable extends Serializable {

    String getKey();

    String getObjectKey();
}
