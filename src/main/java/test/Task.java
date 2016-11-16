package test;

import org.mybatis.spring.SqlSessionTemplate;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Created by Administrator on 2016/10/29.
 */
public class Task {
    
    public  int addUser(SqlSessionTemplate sfb,String userName,String passWord){
        Map u=new HashMap();
        u.put("userName",userName);
        u.put("passWord",passWord);
        u.put("gander",1);
        return sfb.insert("user.userMapper.addUser",u);
    }


    public static void main(String[] args) {
        Object o=InitContext.ctx.getBean("masterSqlSessionFactory");
        System.out.println("masterSqlSessionFactory---"+o.getClass().getName());
        final SqlSessionTemplate sfb=InitContext.ctx.getBean("masterSqlSessionTemplate",SqlSessionTemplate.class);
        System.out.println("masterSqlSessionTemplate---"+sfb);
        int i=10000;
        while(i>0){
            final int j=--i;
            final int t=new Random().nextInt(9);
            if(t<7){
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        System.out.println(j);
                        new Task().addUser(sfb,"user_"+t,"p_"+t);
                    }
                }).start();
            }else {
                try {
                    System.out.println("sleep for a while");
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        
        
        
    }
    
    
}
