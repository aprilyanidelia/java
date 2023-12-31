
package table;
import java.sql.*;

public class table {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/pelajar";
    
    static final String USER = "root";
    static final String PASS = "";
    
    public static void main (String[]args){
        Connection conn = null;
        Statement stmt = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Connecting to a selected database...");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
            System.out.println("Connected database succefully...");
            
            System.out.println("Creating table in given database...");
            stmt=conn.createStatement();
            
            String sql = "CREATE TABLE REGISTRATION"+
                    "(id INTEGER not NULL,"+"first VARCHAR(255),"+
                    "last VARCHAR(255),"+"age INTEGER,"+
                    "PRIMARY KEY (id))";
            stmt.executeUpdate(sql);
            System.out.println("Create table in given database...");
        }catch(SQLException se){
            se.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            try{
                if (stmt !=null)
                conn.close();
            }catch (SQLException se){}
            try{
                if (conn !=null)
                conn.close();
            }catch(SQLException se){
                se.printStackTrace();
            }
        }
        System.out.println("Goodbye!");
    }
}
