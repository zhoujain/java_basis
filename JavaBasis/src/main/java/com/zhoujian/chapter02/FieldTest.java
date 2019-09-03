package com.zhoujian.chapter02;
class Person {
    String name;
    int age;
    static int eyeNum;
    public void info(){
        System.out.println("名字："+name
                +" 年龄:"+age);
    }
}

public class FieldTest {
    public static void main(String[] args) {
        Person.eyeNum = 2;
        System.out.println("眼睛："+Person.eyeNum);
        Person p = new Person();
        p.name ="猪八戒";
        p.age = 300;
        System.out.println("p的眼睛数："+Person.eyeNum);

        Person p2 = new Person();
        p2.name ="猪八戒1";
        p2.age = 3000;
        p2.info();

        System.out.println("p的眼睛数："+Person.eyeNum);
        /**'
         * 大部分类和对象严格区分开
         *
         * 所有类都是Class实例
         * 反射获取某个类对应实例Class Person.class Class.forName(""Persopn")
         *
         * 因为类变量属于Person类，不可以通过实例来访问实例
         * 类的是实例是访问属于类的实例对象
         *
         * 每次创建java对象都需要为实例变量分配内存
         */
    }
}

