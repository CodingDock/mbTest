package com.mb;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Administrator on 2016/11/30.
 */
@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes = { com.trc.config.MyBatisConfig.class })
@ContextConfiguration(value = "classpath*:/spring/applicationContext.xml")
public abstract class AbstractTest {
        
}
