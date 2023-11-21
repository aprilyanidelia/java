
package database;

import java.sql.*;
public class pelajar_db {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/";
    
    static final String USER = "root";
    static final String PASS = "";
    
    public static void main(String[]args){
        Connection conn = null;
        Statement stmt = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            
            System.out.println("Connecting Database...");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
            
            System.out.println("Creating Database...");
            stmt = conn.createStatement();
            
            String sql = "CREATE DATABASE PELAJAR";
            stmt.executeUpdate(sql);
            
            System.out.println("Database created succesfully...");
        }catch (SQLException se){
            se.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }finally{
            try{
                if (stmt !=null)
                stmt.close();
            }catch (SQLException se2){}
        try{
            if (conn !=null)
            conn.close();
        }catch (SQLException se){
            se.printStackTrace();
        }
        }
            System.out.println("Goodbye!");
    }
   }