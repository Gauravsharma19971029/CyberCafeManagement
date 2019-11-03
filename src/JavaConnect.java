import java.io.*;
import java.sql.*;
import javax.swing.*;
public class JavaConnect {
    Connection conn;
    public static Connection connectDb(){
        try{
            Class.forName("org.sqlite.JDBC");
            Connection conn= DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Gaurav\\Documents\\NetBeansProjects\\CyberCafeManagement\\CyberCafeDatabase.sqlite");
            return conn;
            
        }
        catch(Exception e)
        {
           JOptionPane.showMessageDialog(null, e);
           return null;
        }
    }
    
}
