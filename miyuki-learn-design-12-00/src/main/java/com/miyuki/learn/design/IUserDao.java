package com.miyuki.learn.design;

import com.miyuki.learn.design.agent.Select;

/**
 * @author: miyuki
 * @description: dao
 * @date: 2023/9/11 20:55
 * @version: 1.0
 */
public interface IUserDao {

    @Select("select userName from user where id = #{uId}")
    String queryUserInfo(String uId);

}
