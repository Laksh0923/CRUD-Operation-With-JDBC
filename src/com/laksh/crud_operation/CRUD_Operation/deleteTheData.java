package com.laksh.crud_operation.CRUD_Operation;
import com.laksh.crud_operation.JDBC_Utils.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class deleteTheData {
    public void deleteTheData(){
        Scanner sc = new Scanner(System.in);
        Connection conn = jdbc.getConnection();

        try {
            String sql = "DELETE FROM studentInfo WHERE id = ?";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);

            System.out.print("Enter the id you want to delete : ");
            int id = sc.nextInt();

            preparedStatement.setInt(1, id);

            int result = preparedStatement.executeUpdate();
            if(result == 0) System.out.println("No data deleted...");
            else System.out.println("Data deleted successfully!!!");

            jdbc.close(conn, preparedStatement);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
