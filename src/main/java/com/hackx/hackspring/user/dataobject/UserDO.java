package com.hackx.hackspring.user.dataobject;

import com.hackx.hackspring.common.cache.Cachable;

/**
 * Created by hackx on 8/14/16.
 */
public class UserDO implements Cachable {

    public static final String OBJECT_KEY = "USER";
    private static final long serialVersionUID = 6411294475319227023L;
    private String id;
    private String name;

    public UserDO(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getKey() {
        return getId();
    }

    @Override
    public String getObjectKey() {
        return OBJECT_KEY;
    }
}
