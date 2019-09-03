package com.zhoujian.chapter02.chapter2_2;

import com.zhoujian.chapter01.arrayTest.domain.Person;

/**
 * 父类构造函数的执行过程
 */
class person{
    public person() {
        System.out.println("无参构造函数");
    }
    public person(String name){
        this();
        System.out.println("有参构造函数"+name);
    }
}
class Student extends person {
    public Student() {
       super("帅哥");
        System.out.println("无参构造函数");
    }
    public Student(String name,String age){
        this();
        System.out.println("有参构造函数"+name+ " "+age);
    }
}
public class InitTest {
    public static void main(String[] args) {
        new Student("周建","20");
    }
}
/**
 * super显示调用父类的构造函数 ，this调用本类的另一个重载构造函数，只能在构造器使用，必须第一行，最多调用一次
 */
