package com.laksh.crud_operation.JDBC_Utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class jdbc {
    public static Connection getConnection(){
        Connection con = null;
        try {
            // Load and register the Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Establish the connection
            String url = "jdbc:mysql://localhost:3306/database-name";
            String user = "root";
            String pwd = "password";
            con = DriverManager.getConnection(url, user, pwd);
        } catch (SQLException e) {
            e.printStackTrace();
        }  catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return con;
    }

    public static void close(Connection con, PreparedStatement preparedStatement){
        try {
            preparedStatement.close();
            con.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }



}
