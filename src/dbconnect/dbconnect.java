/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Imran Brono
 */
public class dbconnect {

public static Connection Connect(){

    Connection sos = null;
    try{
    
        Class.forName("com.mysql.jdbc.Driver");
        sos = DriverManager.getConnection("jdbc:mysql://localhost:3306/warranty-management-system","root","");
        System.out.println("Connected");
        
        
    }  catch (Exception e){
        JOptionPane.showMessageDialog(null, e);
    }  
    return sos;
} 
    
}
