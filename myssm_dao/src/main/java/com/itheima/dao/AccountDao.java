package com.itheima.dao;

import com.itheima.domain.Account;

import java.util.List;


public interface AccountDao {
    //查询所有
    List<Account> findAll();

    //添加新用户
    void saveAccount(Account account);
}
