package com.zhoujian.chapter01.arrayTest;

public class ArrayTest01 {
    public static void main(String[] args) {
        //静态初始化第一个数组
        String [] books = new String[]{
                "疯狂java讲义",
                "轻量级Java EE开发",
                "疯狂Ajax讲义",
                "疯狂XML讲义",
        };
        //静态初始化第二个数组
        String [] names= new String[]{
                "孙悟空",
                "猪八戒",
                "白骨精",
        };
        //动态初始化第二个数组
        String [] strArr = new String[5];
        /**
         * Java数组不同的类型会赋予不同的初始值
         * Java数组是静态的 初始化完成内存分配就结束了 程序无法改变数组的长度
         * java是一种引用类型 数组变量只是句柄 只是指向堆内存的数组对象 改变数据引用的数组造成数组长度可变的假象
         * 变量在main栈区   数组在堆内存区域
         *
         * JavaScript是动态数组
         *    数组的内存是可以随时改变的
         * */
        strArr =names;
        books=names;
        System.out.println("第一个数组的长度："+books.length);
        System.out.println("第二个数组的长度："+names.length);
        System.out.println("第一个数组的长度："+strArr.length);
    }

}
