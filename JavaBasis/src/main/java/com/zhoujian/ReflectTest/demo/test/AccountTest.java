package com.zhoujian.ReflectTest.demo.test;

import com.zhoujian.ReflectTest.demo.domain.Account;
import com.zhoujian.ReflectTest.demo.service.IAccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:bean.xml")
public class AccountTest {
    @Autowired
    private IAccountService accountService;
    @Test
    public void test1(){
        List<Account> list =  accountService.findAllAccount();
        for(Account account:list)
            System.out.println(account.toString());
    }

    @Test
    public void test2(){
       accountService.tranfer("bbb","aaa",100f);
    }
}
