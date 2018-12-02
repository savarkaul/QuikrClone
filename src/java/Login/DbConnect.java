/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import java.sql.*;

/**
 *
 * @author My Pc
 */
public class DbConnect {
    public static void main(String[] args) {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/quikr","root","Mrigya7838");
            Statement stmt=conn.createStatement();
            /*Similarly, Statement is interface so it can't have an object, so createStatement()
            goes to its class where the object is created. Obviously the same class implements Statement.
            */
            ResultSet rs=stmt.executeQuery("Select * from userlog");
            /*Similarly, ResultSet is interface so it can't have an object, so executeQuery()
            goes to its class where the object is created. Obviously the same class implements ResultSet.
            */
            while(rs.next())
            {
                //In ResultSet, both columns and rows start with index 1.
                System.out.print(rs.getString(1)+"\t");//For ID
                System.out.print(rs.getString(2)+"\t");//For Name
                //For Email
                System.out.println();
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
}
