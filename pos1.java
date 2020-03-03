/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shen;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

/**
 *
 * @author AICS-CEBU
 */
public class pos1 {
    public static void main(String args[]){  
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("ID");
        int data1 = in.nextInt();
        System.out.println("enter your username");
        String data2 = in.next();
        System.out.println("enter your amount");
        Double data3 = in.nextDouble();
        System.out.println("enter your quantity");
        int data4 = in.nextInt();
        Double Total = data3 * data4;
        System.out.println("your Total is:" + Total);
        System.out.println("enter your cash");
        int cash = in.nextInt();
        System.out.println("your cash" + cash);
        Double change = Total - cash;
        System.out.println("your amout is:" + change);
    }
        static void insert(int uid, String data1,String data2,int data3)
                try{
                   //Establishing a connection
                    class.forName ("com.mysql.jdbc.Drive");
                     Connection con = DriveManager.getConnection{
                        "jdbc:mysql://localhost/jdbc ","root", "");
                        Statement st = con.create Statement();
                        String sql = "insert into emptable values (" +uid+ ",' )"
                         System.out.printIn(sql);
                         st.executeUpdate(sql);
                         con.close();
                    }
                 catch (Exception e){
                        System.out.print(e);
                    }
                    }
                }
        
}
