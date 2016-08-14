package com.hackx.hackspring.user.service;

import com.hackx.hackspring.common.cache.Cachable;
import com.hackx.hackspring.common.cache.CacheService;
import com.hackx.hackspring.user.dataobject.UserDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

/**
 * Created by hackx on 8/14/16.
 */
@Service("userService")
public class UserService implements CacheService<UserDO> {

    @Autowired
    RedisTemplate<String, Cachable> redisTemplate;


    @Override
    public void put(UserDO user) {
        redisTemplate.opsForHash().put(user.getObjectKey(), user.getKey(), user);
    }

    @Override
    public void delete(UserDO key) {
        redisTemplate.opsForHash().delete(key.getObjectKey(), key.getKey());
    }

    @Override
    public UserDO get(UserDO key) {
        return (UserDO) redisTemplate.opsForHash().get(key.getObjectKey(), key.getKey());
    }

}
