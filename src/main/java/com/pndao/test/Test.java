package com.pndao.test;

import com.test.user.bean.User;
import test.InitContext;

/**
 * Created by 肖明明 on 2016/11/30.
 */
public class Test {

    public static void main(String[] args) {

        UserDao userDao=InitContext.ctx.getBean(UserDao.class);

        User u=new User("tom","1243354");


        userDao.insert(u);

        
        
    }
}
