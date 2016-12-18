package com.mb;

import com.mb2.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Administrator on 2016/12/16.
 */

public class mb2Test extends AbstractTest{

    @Autowired
    UserService userService;
    
    @Test
    public void getUserById(){
        userService.getUserById(7853);
        
        
    }
    
    
}
