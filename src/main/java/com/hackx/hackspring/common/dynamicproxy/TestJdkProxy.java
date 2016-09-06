package com.hackx.hackspring.common.dynamicproxy;

import java.lang.reflect.Proxy;

/**
 * Created by hackx on 9/6/16.
 */
public class TestJdkProxy {

    public static void main(String[] args) {
        ProxyService target = new ProxyServiceImpl();
        JdkProxyHandler handler = new JdkProxyHandler(target);

        ProxyService proxyService = (ProxyService) Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                handler);


        proxyService.businessProcess();
    }
}
