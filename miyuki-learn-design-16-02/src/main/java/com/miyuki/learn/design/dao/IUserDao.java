package com.miyuki.learn.design.dao;

import org.itstack.demo.design.po.User;

public interface IUserDao {

     User queryUserInfoById(Long id);

}
