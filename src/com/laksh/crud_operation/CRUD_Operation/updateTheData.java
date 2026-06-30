package com.laksh.crud_operation.CRUD_Operation;
import com.laksh.crud_operation.JDBC_Utils.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class updateTheData {
    public void updateTheData(){

        Scanner sc=new Scanner(System.in);
        Connection conn = jdbc.getConnection();

        try {
            String sql = "UPDATE studentInfo SET age=? WHERE id=?";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);

            System.out.print("Enter the id you want to update : ");
            int id = sc.nextInt();
            System.out.print("Enter the age you want to set : ");
            int age = sc.nextInt();

            preparedStatement.setInt(1, age);
            preparedStatement.setInt(2, id);

            int result = preparedStatement.executeUpdate();
            if(result == 0) System.out.println("No data updated...");
            else System.out.println("Data updated successfully!!");

            jdbc.close(conn, preparedStatement);

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
