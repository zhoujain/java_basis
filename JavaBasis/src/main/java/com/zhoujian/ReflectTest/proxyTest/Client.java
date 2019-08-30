package com.zhoujian.ReflectTest.proxyTest;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 模拟消费者
 */
public class Client {
    public static void main(String[] args) {
       final Producer producer = new Producer();
        /**
         * 动态代理
         *特点 字节码随时创建，随时创建
         * 作用 不修改源码上争强对象
         * 分类：
         *      基于接口的动态代理
         *      基于子类的动态代理
         * 基于接口的动态代理
         *      涉及Proxy
         *      JDK
         * 如何创建代理对象
         *       使用Proxy的newProxyInstance方法
         * 创建代理对象的要求
         *        被代理类最少实现一个接口 如果没有则不能使用
         * newProxyInstance方法的参数
         *        ClassLoader 类加载器
         *        它用于加载字节码，和被代理相同类加载器 固定写法
         *        Class[]  字节马数组
         *        代理对象和被代理对象有相同方法
         *
         *        InvocationHandler 提供增强的代码
         *        如何写代理 接口的实现类 通常匿名内部类 不是必须
         *        实现类谁用谁写
         */
       IProducer proxyProducer = (IProducer) Proxy.newProxyInstance(producer.getClass().getClassLoader(),
                producer.getClass().getInterfaces(), new InvocationHandler() {
                   /**
                    * 作用：执行被代理对象的任何接口都会经过这个方法
                    * @param proxy 代理对象的引用
                    * @param method 当前方法
                    * @param args 当前执行方法需要的参数
                    * @return  和代理对象有相同放回值
                    * @throws Throwable
                    */
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        //提供增强代码
                        String name = method.getName();
                        Float money = (Float)args[0];
                        Object rtValue = null;
                        if("saleProduct".equals(name)){
                            rtValue = method.invoke(producer,money*0.8f);
                        }
                        if("afterService".equals(name)){
                            rtValue = method.invoke(producer,money*1.1f);
                        }
                        return rtValue;
                    }
                });

       proxyProducer.saleProduct(1000f);
       proxyProducer.afterService(100f);
    }

}
