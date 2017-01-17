package com.pndao.test;

import com.test.user.bean.User;
import com.trc.pndao.annotations.DaoGen;
import org.springframework.stereotype.Component;

/**
 * Created by 肖明明 on 2016/11/30.
 */
@DaoGen
public interface  UserDao {

    int insert(User t);
    
}
