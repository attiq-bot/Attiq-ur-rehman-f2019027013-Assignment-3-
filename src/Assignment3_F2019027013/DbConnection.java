package Assignment3_F2019027013;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DbConnection {
    public Connection getConnection(){
        Connection con = null;
        try {
            try {  
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, ex);
            }

            con = DriverManager.getConnection("jdbc:sqlserver://DESKTOP-8CLROTH\\SQLEXPRESS;databaseName=Cities;user=Admin;password=1234567890;database=JavaRelatedDB");
            System.out.println("Connected to database !");
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        } 
        
        return con;
        
    }
}
