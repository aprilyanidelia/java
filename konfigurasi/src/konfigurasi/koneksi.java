
package konfigurasi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class koneksi {
    public static Connection getConnection(){
     Connection conn = null;
     String url = "jdbc:mysql://localhost:3306/pos_delia";
     String user = "root";
     String password = "";
     try{
         conn=DriverManager.getConnection(url,user,password);
     }catch (SQLException e)
     {
       System.out.println(e);
     }
     return conn;
    }
    public static void main(String[] args) {
        try{
            Connection c=koneksi.getConnection();
            System.out.println(String.format("Connected to database %s" + " suscessfuly.",c.getCatalog()));
        }catch (SQLException e)
        {
            System.out.println(e);
        }
    }
}

