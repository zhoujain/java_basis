package com.zhoujian.ReflectTest.proxyTest01;

import com.zhoujian.ReflectTest.proxyTest.IProducer;

/**
 * 生产者
 */
public class Producer{
    /**
     * 销售
     * @param money
     */
    public void saleProduct(Float money){
        System.out.println("销售商品；获得："+money);
    }

    /**
     * 售后
     * @param money
     */
    public void afterService(Float money){
        System.out.println("售后商品；获得："+money);
    }
}
