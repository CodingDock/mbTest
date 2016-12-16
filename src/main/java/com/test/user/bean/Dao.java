package com.test.user.bean;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import test.InitContext;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2016/11/12.
 */
@Component
public class Dao {

    @Autowired
    SqlSessionTemplate sfb;

    public void hello(){
        System.out.println("hello");
    }

    public  int addUser(String userName,String passWord){
//        SqlSessionTemplate sfb=InitContext.ctx.getBean("masterSqlSessionTemplate",SqlSessionTemplate.class);
        Map u=new HashMap();
        u.put("userName",userName);
        u.put("passWord",passWord);
        u.put("gander",1);
        return sfb.insert("user.userMapper.addUser",u);
    }

}
