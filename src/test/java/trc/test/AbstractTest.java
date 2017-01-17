package trc.test;


import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * @author code4crafter@gmail.com
 *         Date: 16/10/30
 *         Time: 下午8:46
 */
@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes = { MyBatisConfig.class })
@ContextConfiguration(locations={"classpath:/spring/applicationContext.xml"})
public abstract class AbstractTest {
}
