package com.hackx.hackspring.common.cache;

/**
 * Created by hackx on 8/14/16.
 */
public interface CacheService<V extends Cachable> {

    void put(V obj);

    V get(V key);

    void delete(V key);
}
