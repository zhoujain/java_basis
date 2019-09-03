package com.zhoujian.chapter02;

/**
 * 类的初始化
 */
public class PriceTest {
    public static void main(String[] args) {
        System.out.println(Price.INSTANCE.currentPrice);
        //显示创建Price实例
        Price p = new Price(2.8);
        System.out.println(p.currentPrice);
    }
}
class Price{

    //类成员price的实例
    final static Price INSTANCE = new Price(2.8);
    //定义类变量
    static double initPrice = 20;


    //实例变量
    double currentPrice;
    public Price(double discount) {
        //根据静态变量计算实例变量
        currentPrice = initPrice - discount;
    }
}
/**
 * 执行步骤
 * 1.系统为Price俩个类变量分配内存空间
 * 初始化代码
 */
