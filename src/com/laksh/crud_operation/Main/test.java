package com.laksh.crud_operation.Main;
import com.laksh.crud_operation.CRUD_Operation.deleteTheData;
import com.laksh.crud_operation.CRUD_Operation.insertTheData;
import com.laksh.crud_operation.CRUD_Operation.retrieveTheData;
import com.laksh.crud_operation.CRUD_Operation.updateTheData;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        insertTheData obj1 = new insertTheData();
        updateTheData obj2 = new updateTheData();
        deleteTheData obj3 = new deleteTheData();
        retrieveTheData obj4 = new retrieveTheData();

        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("1. Insert Data");
            System.out.println("2. Update Data");
            System.out.println("3. Delete Data");
            System.out.println("4. Retrieve Data");
            System.out.println("5. Exit");
            System.out.print("Enter the number according to your operation : ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    obj1.insertTheData();
                    break;
                case 2:
                    obj2.updateTheData();
                    break;
                case 3:
                    obj3.deleteTheData();
                    break;
                case 4:
                    obj4.retrieveTheData();
                    break;
                case 5:
                    System.out.println("Exited successfully!!!");
                    System.exit(0);
            }
        }
    }
}
