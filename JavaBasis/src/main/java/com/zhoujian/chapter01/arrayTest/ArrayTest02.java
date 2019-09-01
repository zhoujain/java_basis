package com.zhoujian.chapter01.arrayTest;

/**
 * 基本类型的数组
 */
public class ArrayTest02 {
    public static void main(String[] args) {
        int [] x;
        //System.out.println(x.length);
        /**
         * 数组变量不需要初始化，只需让他指向数组对象必须初始化(分配内存和初始值)
         */
        int [] iArr = null;
        /**
         * 只要不访问iArr属性和方法,程序完全可以使用该数组变量
         *
         */
        System.out.println(iArr);
        /**
         * 只有当iArr指向有效数组对象后,才能访问属性和方法
         */
        iArr = new int[5];
        System.out.println(iArr.length);
        /**
         * 异常：NullPointerException 空指针异常
         * 当引用变量访问实例属性，或调用非静态方法时，引用对象还未引用一个有效的对象
         */
    }
}
