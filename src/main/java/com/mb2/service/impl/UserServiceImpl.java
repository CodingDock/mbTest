package com.mb2.service.impl;

import com.mb2.bean.User;
import com.mb2.dao.UserMapper;
import com.mb2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2016/12/16.
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserMapper userMapper;
    
    @Override
    public void getUserById(int id){
        User u=this.userMapper.getUser(7853);
        System.out.println(u);
        
        u=userMapper.getFirstrecord("2016-11-12 22:51:43");
        System.out.println(u);
    }
    
}
