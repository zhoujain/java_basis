package com.zhoujian.chapter01.arrayTest;

/**
 * N维数组是数组元素是N-1维数组的数组
 * 初始化多维数组可以先只初始化最左边的维度
 */
public class TwoDimensionTest {
    public static void main(String[] args) {
        //定义一个二维的数组
        int[][] a;
        //a当作一维数组初始化，初始化4的数组
        //存储都是引用数据对象
        a = new int[4][];
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }

        a[0] = new int[2];

        a[0][1]=6;
        for(int i=0;i<a[0].length;i++){
            System.out.println(a[0][i]);
        }
    }
}
