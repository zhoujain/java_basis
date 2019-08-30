package com.zhoujian.ReflectTest.AOPTest02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 基于注解的AOP控制
 */
public class testAOP {
    public static void main(String[] args) {
        //获取容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean3.xml");
        //获取对象
        IAccountService accountService = (IAccountService)applicationContext.getBean("accountService");
        accountService.save();
    }
}
