package com.xmm.genarate;

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
    
    
    
    @Transactional()//isolation= Isolation.REPEATABLE_READ
    public int getWorkId(){
        
        String times=getBeforeHeartBeat();
        
        User u=masterSqlSessionTemplate.selectOne("user.userMapper.getFirstrecord",times);
        System.out.println(u);
        u.setCreate_time(new Date());
        
        
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

    public static void main(String[] args) throws ParseException {
        WorkIdHandle wh=InitContext.ctx.getBean(WorkIdHandle.class);
        wh.getWorkId();
        
    }
    
}
