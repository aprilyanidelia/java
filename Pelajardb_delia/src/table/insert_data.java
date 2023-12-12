
package table;
import java.sql.*;

public class insert_data {
    static final String JDBC_DRIVER ="com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/pelajar";
    
    static final String USER = "root";
    static final String PASS="";
    
    public static void main(String[]args){
      Connection conn = null;
      Statement stmt = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            
            System.out.println("Connecting to a selected database...");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
            System.out.println("Connected database succesfully...");
            
            System.out.println("Inserting records into the table...");
            stmt = conn.createStatement();
            
            String sql ="INSERT INTO registration VALUES(100,'zara','ali',18)";
            stmt.executeUpdate(sql);
            sql ="INSERT INTO registration VALUES(101,'teguh','yusuf',25)";
            stmt.executeUpdate(sql);
            sql ="INSERT INTO registration VALUES(102,'andri','susi',30)";
            stmt.executeUpdate(sql);
            sql ="INSERT INTO registration VALUES(103,'sumi','mita',28)";
            stmt.executeUpdate(sql);
            System.out.println("inserted records into the table...");
        }catch(SQLException se){
            se.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }finally{
            try{
                if (stmt !=null)
                    conn.close();
            }catch (SQLException se){}
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

