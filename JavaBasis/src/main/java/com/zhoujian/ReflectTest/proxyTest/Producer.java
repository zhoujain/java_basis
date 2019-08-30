package com.zhoujian.ReflectTest.proxyTest;

import java.io.FileOutputStream;

/**
 * 生产者
 */
public class Producer implements IProducer{
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
