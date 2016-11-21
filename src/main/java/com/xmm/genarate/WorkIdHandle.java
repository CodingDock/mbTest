package com.xmm.genarate;

import com.sun.jdi.DoubleType;
import com.test.user.bean.User;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;
import test.InitContext;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by 肖明明 on 2016/11/17.
 */
@Component
public class WorkIdHandle {
    

    @Autowired
    public SqlSessionTemplate masterSqlSessionTemplate;


//    private static WorkIdHandle workIdHandle =new WorkIdHandle();
//    private WorkIdHandle(){
//    }
//    
//    public static WorkIdHandle getInstance(){
//        return workIdHandle;
//    }
    
    
    
    @Transactional(isolation= Isolation.SERIALIZABLE)//isolation= Isolation.REPEATABLE_READ
    public int getWorkId1() throws InterruptedException {

        String times=getBeforeHeartBeat();

        User u=masterSqlSessionTemplate.selectOne("user.userMapper.getFirstrecord",times);
        System.out.println(u);
        
        int i =masterSqlSessionTemplate.update("user.userMapper.updateUserCreateTime",u);
        System.out.println("i---"+i);
//        if(i!=1)
//            throw new RuntimeException("ddddd");
        int n=20;
        while(n!=0){
            Thread.sleep(1500);
            System.out.print("sleeping\t");
            n--;
        }
        return 0;
    }

    @Transactional(isolation= Isolation.SERIALIZABLE)//isolation= Isolation.REPEATABLE_READ
    public int getWorkId2(){

        String times=getBeforeHeartBeat();

        User u=masterSqlSessionTemplate.selectOne("user.userMapper.getFirstrecord",times);
        System.out.println(u);

        int i =masterSqlSessionTemplate.update("user.userMapper.updateUserCreateTime",u);
        System.out.println("i---"+i);
//        if(i!=1)
//            throw new RuntimeException("ddddd");

        return 0;
    }
    
    public static String getNextHeartBeat(){
        long l=System.currentTimeMillis()+5*60*1000;
        return sdf.format(new Date(l));
    }

    public static String getBeforeHeartBeat(){
        long l=System.currentTimeMillis()-5*60*1000;
        return sdf.format(new Date(l));
    }
    
    static SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public static void main(String[] args) throws ParseException, InterruptedException {
        WorkIdHandle wh=InitContext.ctx.getBean(WorkIdHandle.class);
        wh.getWorkId1();
        
    }
    
}
