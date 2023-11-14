//package com.chj.proxy.cglib;
//
///**
// * @projectName: design_pattern_stu
// * @package: com.chj.proxy.cglib
// * @className: ProxyFactory
// * @author: chj
// * @description:
// * @date: Created in  2023/8/22 19:49
// * @version: 1.0
// */
//public class ProxyFactory implements MethodInterceptor{
//
//    private Object target;
//
//    public ProxyFactory(Object target) {
//        this.target = target;
//    }
//
//    //返回一个代理对象： 是target对象的代理对象
//    public Object getProxyInstance(){
//        //1、创建一个工具类
//        Enhancer enhancer = new Enhancer();
//        //2、设置父类
//        enhancer.setSuperclass(target.getClass());
//        //3、设置回调函数
//        enhancer.setCallback(this);
//        //4、创建子类对象，即代理对象
//        return enhancer.create();
//    }
//
//    @Override
//    public Object intercept(Object arg0, Method method, Object[] arg2, MethodProxy arg3){
//        System.out.println("cglib代理 开始");
//        Object returnVal = method.invoke(target,arg2);
//        System.out.println("cglib代理 结束");
//        return returnVal;
//    }
//}
