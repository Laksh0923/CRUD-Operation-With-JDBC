package com.laksh.crud_operation.CRUD_Operation;
import com.laksh.crud_operation.JDBC_Utils.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class retrieveTheData {
    public void retrieveTheData(){

        Connection conn = jdbc.getConnection();

        try {
            Statement statement = conn.createStatement();

            String sql = "SELECT * FROM studentInfo";
            ResultSet result = statement.executeQuery(sql);

            while(result.next()){
                System.out.println("Id : " + result.getString("id"));
                System.out.println("Name : " + result.getString("name"));
                System.out.println("Age : " + result.getString("age"));
                System.out.println("City : " + result.getString("city"));

                System.out.println();
            }

            System.out.println("Retrieve the data successfully!!!");

            result.close();
            conn.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
