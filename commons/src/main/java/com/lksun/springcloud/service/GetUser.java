package com.lksun.springcloud.service;

import com.lksun.springcloud.entities.User;

public class GetUser {
    public User getUserById(Integer id){
        User user = new User();
        user.setId(id);
        user.setName("周杰伦");
        user.setSex("男");
        user.setAge(18);
        return user;
    }
}
