package com.zhoujian.chapter01.arrayTest;

public class ObjectArrayTest {
    public static void main(String[] args) {
        Object[] objArr= new Object[3];

        objArr[1] = new Object[2];

        Object[] objArr2 = (Object[])objArr[1];
    }
    /**
     * 多维数组本质依然是一维数组
     */
}
