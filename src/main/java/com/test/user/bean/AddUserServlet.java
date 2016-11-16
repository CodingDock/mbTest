package com.test.user.bean;

import java.io.IOException;

/**
 * Created by Administrator on 2016/11/12.
 */
public class AddUserServlet extends javax.servlet.http.HttpServlet {
    
    
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        System.out.println("addUser----");
        Dao d=new Dao();
        String userName = request.getParameter("userName");
        String passWord = request.getParameter("passWord");
        System.out.println("userName-:"+userName+"\t"+"passWord-:"+passWord);
        d.addUser(userName,passWord);
        System.out.println("user:<-"+userName+"->is added");
        
    }

    
    
    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        doPost(request,response);
    }
}
