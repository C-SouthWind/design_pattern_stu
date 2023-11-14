package com.chj.proxy.dynamicProxy;

import java.lang.reflect.Proxy;

/**
 * @projectName: design_pattern_stu
 * @package: com.chj.proxy.dynamicProxy
 * @className: ProxyFactory
 * @author: chj
 * @description:
 * @date: Created in  2023/8/22 19:23
 * @version: 1.0
 */
public class ProxyFactory {

    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxyInstance(){
        /**
         * ClassLoader loader,  指定当前目标对象使用的类加载器
         * Class<?>[] interfaces,  目标对象实现的接口类型，使用泛型方法确认类型
         * InvocationHandler h  事件处理，执行目标对象的方法时，会出发事件处理器方法。会把当前执行的目标对象方法作为参数传入
         */
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                (proxy, method, args) -> {
                    System.out.println("JDK代理开始");
                    Object invoke = method.invoke(target, args);
                    System.out.println("JDK代理结束");
                    return invoke;
                });
    }
}














