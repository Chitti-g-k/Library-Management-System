/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.*;
/**
 *
 * @author Chitti
 */
public class ConnectionProvider {
    
    public static Connection getCon(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/lms","root","chitti@333");
            return con;
            
        }
        catch(Exception e){
            System.out.println(e);
            return null;
        }
        
    }

    
    
}
