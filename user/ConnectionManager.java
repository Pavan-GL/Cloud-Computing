/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Esha_1
 */
public class ConnectionManager {
    private static String url="jdbc:mysql://localhost:3306/College";
    private static String driverName="com.mysql.jdbc.Driver";
    private static String username="root";
    private static String password="root";
    private static Connection con;
    
    public static Connection getConnection()
    {
        try
        {
            Class.forName(driverName);
            try
            {
                con=DriverManager.getConnection(url,username,password);
            }
            catch(SQLException ex)
            {
                System.out.println("Failed to create the database connection");
            }
        }
        catch(ClassNotFoundException ex)
        {
            System.out.println("Driver Not Found");
        }
        return con;
    }
    
            
        
    
    
}
