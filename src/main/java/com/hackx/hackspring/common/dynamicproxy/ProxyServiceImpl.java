package com.hackx.hackspring.common.dynamicproxy;

/**
 * Created by hackx on 9/6/16.
 */
public class ProxyServiceImpl implements ProxyService {
    @Override
    public void businessProcess() {
        System.out.println("This is business login process!");
    }
}
