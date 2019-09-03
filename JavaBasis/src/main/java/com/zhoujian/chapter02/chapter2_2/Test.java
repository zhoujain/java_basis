package com.zhoujian.chapter02.chapter2_2;


class Base{
    private int i =2;
    public  Base(){
        System.out.println(this.i);
        System.out.println(this.getClass());
        this.display();
    }
    public void display(){
        System.out.println(i);
    }
}
class Derived extends Base{

    private  int i=22;
    public Derived(){
        i = 222;
    }
    public void display1(){
        System.out.println(i);
    }
}
public class Test {
    public static void main(String[] args) {
        new Derived();
    }
}
/**
 * this代表正在初始化的java对象 this代表Derived对象
 *变量编译类型和运行时类型不同时 该实例变量值由声明该变量的类型决定
 * 调用引用方法由实际引用对象决定
 * 属性父类 方法子类
 */
