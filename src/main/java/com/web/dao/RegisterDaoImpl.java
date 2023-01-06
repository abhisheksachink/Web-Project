package com.web.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.web.model.user;

public class RegisterDaoImpl{
	public static int insert(user u){  
        int status=0;  
        Connection con = null;
        try{  
        	Class.forName("com.mysql.cj.jdbc.Driver");
        	String url = "jdbc:mysql://localhost:3306/infinite";
	        String user = "root";
	        String pass = "india@123";
	        con = DriverManager.getConnection(url,user,pass);
            PreparedStatement ps=con.prepareStatement(  
                         "insert into user_det(user_id,phone) values (?,?)");  
            ps.setString(1,u.getUserId());  
            ps.setString(2,u.getPhone());  
 
              
            status=ps.executeUpdate();  
              
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
        return status;  
    }
}
