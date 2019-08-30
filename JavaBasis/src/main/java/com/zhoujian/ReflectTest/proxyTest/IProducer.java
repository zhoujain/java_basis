package com.zhoujian.ReflectTest.proxyTest;

public interface IProducer {
    /**
     * 销售
     * @param money
     */
    void saleProduct(Float money);


    /**
     * 售后
     * @param money
     */
    void afterService(Float money);
}
