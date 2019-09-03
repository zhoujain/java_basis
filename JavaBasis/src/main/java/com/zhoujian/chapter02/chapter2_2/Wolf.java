package com.zhoujian.chapter02.chapter2_2;

/**
 * 权限允许，子类可以调用父类的方法，父类不可以调用子类的方法 。父类不知道哪个子类继承
 * 除非子类重写父类的方法 父类表面调用属于自己的，但随着context的改变，将会变成父类调用子类的方法
 */
class Animal{
    private String desc;

    public Animal() {
        System.out.println("执行Animal的构造函数");
        this.desc = getDesc();
    }

    public String getDesc() {
        System.out.println("执行Animal的get方法");
        return "Animal";
    }

    @Override
    public String toString() {
        System.out.println("执行Animal的toString方法");
        return "Animal{" +
                "desc='" + desc + '\'' +
                '}';
    }
}
public class Wolf extends Animal {
    private String name;
    private double weight;

    public Wolf(String name, double weight) {
        System.out.println(name);
        System.out.println("执行Wolf的构造函数");
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String getDesc() {
        System.out.println("执行Wolf的getDesc方法");
        return "Wolf{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

    public static void main(String[] args) {
        System.out.println(new Wolf("大灰狼",1.1));
    }
}
/**
 * getDesc方法被子类重写过的方法。调用子类this.name = name在getDesc方法之后执行
 *
 * 方法被重写就会执行子类的方法，子类只初始化变量（0，false，bnull）却没有对变量赋值，被调用
 */
