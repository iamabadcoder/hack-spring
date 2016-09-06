package com.hackx.hackspring.common.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by hackx on 9/6/16.
 */
public class JdkProxyHandler implements InvocationHandler {

    private Object target;

    public JdkProxyHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        PerformanceMonitor.begin();
        Object obj = method.invoke(target, args);
        PerformanceMonitor.end();
        return obj;
    }
}
