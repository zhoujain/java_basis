package com.zhoujian.chapter02;

/**
 * 初始化的三种方式
 * 1.构造函数
 * 2.静态代码块
 * 3.定义实例变量时
 * 2和3在1前 初始化看顺序
 */
class Cat{
    String name;
    String age;

    public Cat(String name, String age) {
        System.out.println("执行构造函数");
        this.name = name;
        this.age = age;
    }
    double weight =2.3;
    {
        System.out.println("执行静态代码块");
        weight = 2.0;
    }


    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", weight=" + weight +
                '}';
    }
}
public class InitTest {
    public static void main(String[] args) {
        Cat cat = new Cat("Tom","11");
        System.out.println(cat);
        Cat cat1 = new Cat("Tom1","111");
        System.out.println(cat1);
    }
}
/**
 * 总结：
 *      定义最先被执行 然后赋值语句独立抽取出来 顺序执行
 *
 *      double weight=2.3
 *      分俩次执行
 *      double weight 分配对象内存
 *      weight=2.3 语句提取到Java类构造器
 */
