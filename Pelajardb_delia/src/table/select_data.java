/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package table;

import java.sql.*;

public class select_data {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/pelajar";
    
    static final String USER = "root";
    static final String PASS = "";
    
    public static void main(String[]args){
        Connection conn = null;
        Statement stmt = null;
        try{
    Class.forName("com.mysql.jdbc.Driver");
    
    System.out.println("Connecting to a selected database...");
    conn = DriverManager.getConnection(DB_URL, USER, PASS);
    System.out.println("Connected database succesfully...");
}catch(SQLException se){
    se.printStackTrace();
}catch (Exception e){
    e.printStackTrace();
}finally{
            try{
                if(stmt !=null)
                    conn.close();
            }catch (SQLException se){}
        }try{
            if(conn !=null)
                conn.close();
        }catch (SQLException se){
            se.printStackTrace();
        }
        System.out.println("Goodbye!");
}
}
