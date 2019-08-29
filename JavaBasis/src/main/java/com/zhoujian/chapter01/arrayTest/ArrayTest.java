package com.zhoujian.chapter01.arrayTest;

public class ArrayTest {
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

        System.out.println("第一个数组的长度："+books.length);
        System.out.println("第二个数组的长度："+names.length);
        System.out.println("第一个数组的长度："+strArr.length);
    }

}
