package test;

import com.test.user.bean.User;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2016/9/27.
 */
public class InitContext {
    
    public static ApplicationContext ctx=null;
    
    static {
//        ctx=new  ClassPathXmlApplicationContext("applicationContext.xml");
//        ctx=new FileSystemXmlApplicationContext("D:\\src\\mbTest\\src\\main\\resources\\spring\\applicationContext.xml");
        ctx=new ClassPathXmlApplicationContext("classpath:/spring/applicationContext.xml");
        
    }


    public static void main(String[] args) {

        
//        Object o=InitContext.ctx.getBean("masterSqlSessionFactory");
//        System.out.println("masterSqlSessionFactory---"+o.getClass().getName());
//        
//        SqlSessionTemplate sfb=InitContext.ctx.getBean("masterSqlSessionTemplate",SqlSessionTemplate.class);
//        System.out.println("masterSqlSessionTemplate---"+sfb);
        System.out.println(System.getProperty("user.home"));
        
        
        
        
    }

    
    
    
}
