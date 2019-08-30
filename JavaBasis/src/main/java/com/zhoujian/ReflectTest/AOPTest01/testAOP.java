package com.zhoujian.ReflectTest.AOPTest01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testAOP {
    public static void main(String[] args) {
        //获取容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean1.xml");
        //获取对象
        IAccountService accountService = (IAccountService)applicationContext.getBean("accountService");
        accountService.save();
    }
}
