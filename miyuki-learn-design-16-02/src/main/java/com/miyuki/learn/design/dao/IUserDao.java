package com.miyuki.learn.design.dao;


import com.miyuki.learn.design.po.User;

public interface IUserDao {

     User queryUserInfoById(Long id);

}
