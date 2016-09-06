package com.hackx.hackspring.common.dynamicproxy;

/**
 * Created by hackx on 9/6/16.
 */
public class TestCglibProxy {

    public static void main(String[] args) {
        CglibProxyHandler cglibProxyHandler = new CglibProxyHandler();
        ProxyServiceImpl proxyService = (ProxyServiceImpl) cglibProxyHandler.getProxy(ProxyServiceImpl.class);
        proxyService.businessProcess();
    }
}
