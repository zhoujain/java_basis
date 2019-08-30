package com.zhoujian.ReflectTest.demo.service.Impl;


import com.zhoujian.ReflectTest.demo.dao.IAccountDao;
import com.zhoujian.ReflectTest.demo.domain.Account;
import com.zhoujian.ReflectTest.demo.service.IAccountService;

import java.util.List;

public class AccountServiceImpl implements IAccountService {
    private IAccountDao accountDao;

    public void setAccountDao(IAccountDao accountDao) {
        this.accountDao = accountDao;
    }

    @Override
    public List<Account> findAllAccount() {
        return accountDao.findAllAccount();
    }

    @Override
    public Account findAccountById(Integer accountId) {
        return accountDao.findAccountById(accountId);
    }

    @Override
    public void saveAccount(Account account) {
        accountDao.saveAccount(account);
    }

    @Override
    public void updateAccount(Account account) {
        accountDao.updateAccount(account);
    }

    @Override
    public void deleteAccount(Integer acccountId) {
        accountDao.deleteAccount(acccountId);
    }

    @Override
    public void tranfer(String sourceName, String goalName, Float money) {
        //1.根据名称查询用户
        Account sAccount = accountDao.findAccountByName(sourceName);
        //2.查询目标用户
        Account gAccount = accountDao.findAccountByName(goalName);
        sAccount.setMoney(sAccount.getMoney()-money);
        gAccount.setMoney(gAccount.getMoney()+money);
        accountDao.updateAccount(sAccount);
        int i =1/0;
        accountDao.updateAccount(gAccount);

    }
}
