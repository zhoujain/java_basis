package com.zhoujian.ReflectTest.proxyTest01;


import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.awt.*;
import java.lang.reflect.Method;

/**
 * 模拟消费者
 */
public class Client {
    /**
     * \
     *要求代理对象不能是最终类
     * 用到：
     *    Enhancer
     * 方法
     *    create(Class,Callback)
     * 方法参数
     *    Class 代理对象的字节码
     *    Callback 如何代理
     * @param args
     */
    public static void main(String[] args) {
        //基于子类的动态代理
      final Producer producer = new Producer();

      Producer producerProxy = (Producer) Enhancer.create(producer.getClass(), new MethodInterceptor() {
          @Override
          /**
           * 前三个和接口的动态代理一样
           * MethodProxy 当前执行方法的代理对象
           */
          public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
              String name = method.getName();
              Float money = (Float)objects[0];
              Object rtValue = null;
              if("saleProduct".equals(name)){
                  rtValue = method.invoke(producer,money*0.8f);
              }
              if("afterService".equals(name)){
                  rtValue = method.invoke(producer,money*1.1f);
              }
              return  rtValue;
          }
      });
    producerProxy.saleProduct(1000f);
    producerProxy.afterService(100f);

    }

}
