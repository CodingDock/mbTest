package com.mb;

import com.test.user.bean.Dao;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Administrator on 2016/11/30.
 */
public class test extends AbstractTest{

    @Autowired
    Dao dao;
    
    @Test
    public void ss(){
        
        dao.hello();
        
    }
    
    
    
    
}
