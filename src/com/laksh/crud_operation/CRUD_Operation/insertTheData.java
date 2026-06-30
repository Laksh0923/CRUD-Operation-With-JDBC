package com.laksh.crud_operation.CRUD_Operation;
import com.laksh.crud_operation.JDBC_Utils.jdbc;
import java.sql.*;
import java.util.Scanner;

public class insertTheData {
    public void insertTheData() {


        Scanner sc = new Scanner(System.in);

        Connection conn = jdbc.getConnection();

        PreparedStatement preparedStatement = null;
        try {
            String sql = "INSERT INTO studentInfo(id, name, age, city) VALUES (?, ?, ?, ?)";
            preparedStatement = conn.prepareStatement(sql);

            System.out.print("Enter the ID : ");
            int id = sc.nextInt();
            System.out.print("Enter the name : ");
            String name = sc.next();
            System.out.print("Enter the age : ");
            int age = sc.nextInt();
            System.out.print("Enter the city : ");
            String city = sc.next();

            preparedStatement.setInt(1, id);
            preparedStatement.setString(2, name);
            preparedStatement.setInt(3, age);
            preparedStatement.setString(4, city);


            // Execute the query
            int result = preparedStatement.executeUpdate();

            if (result == 0) {
                System.out.println("No record inserted...");
            } else {
                System.out.println("Record Inserted successfully!!!");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
            jdbc.close(conn, preparedStatement);
        }
    }
}
