package com.zhoujian.chapter02;

/**
 * 类变量的初始化
 * 1。定义类变量时指定初始化
 * 2.静态初始化块中对类进行初始化
 */
public class StaticInitTest {
    static int count =2;

    //静态代码块
    static {
        System.out.println("执行静态代码块");
        name ="疯狂java";
    }
    static String name = "猪八戒";
    public static void main(String[] args) {
        System.out.println(StaticInitTest.count);
        System.out.println(StaticInitTest.name);
    }
}
/**
 * 先为所有类变量分配内存空间，再按顺序执行初始化
 */
