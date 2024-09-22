package com.Employee;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    public static Connection con;


    public static Connection createDBConnetion() {
            //load driver
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                //get connection
                String url="jdbc:mysql://localhost:3306/employee";
                String username="root";
                String password="M@hir007";
                con=DriverManager.getConnection(url,username,password);
            }catch (Exception e){
                e.printStackTrace();
            }
            return con;
        }
}
