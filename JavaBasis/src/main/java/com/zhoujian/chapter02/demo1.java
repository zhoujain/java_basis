package com.zhoujian.chapter02;

/**
 * 内存管理的俩个方面：内存分配和内存回收
 * JVM为对象在堆内存分配内存空间
 * 回收：java对象失去引用的垃圾回收
 *
 * JVM垃圾回收由一条后台线程完成，非常耗能
 * 以无忌惮的分配内存的坏处
 * 1.系统内存减少，降低运行性能
 * 2.垃圾回收负担加重，降低运行性能
 *
 *
 * java变量 成员变量 局部变量
 * 局部变量：
 * 1.形参
 * 2.方法内局部变量 随着方法的结束而消亡
 * 3.代码块内局部变量 随着代码块的结束而消亡
 *
 * 存储在栈内存中
 *
 * 成员变量：
 * 非静态变量 实例变量
 * 静态变量 类变量
 *
 * static只能修饰类里定义的成员变量
 *
 *
 * 类变量的初始化总是实例变量初始化时机之前
 *
 *
 */
public class demo1 {

}
