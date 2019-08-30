package com.zhoujian.ReflectTest.AOPTest01.Impl;

import com.zhoujian.ReflectTest.AOPTest01.IAccountService;

public class AccountServiceImpl implements IAccountService {

    @Override
    public void save() {
        System.out.println("保存");
    }

    @Override
    public int delete() {
        System.out.println("删除了");
        return 0;
    }

    @Override
    public void findById(Integer id) {
        System.out.println("找到了"+id);
    }
}
